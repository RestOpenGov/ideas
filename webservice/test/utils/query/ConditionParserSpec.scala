package test.utils.query

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import play.Logger

class ConditionParserSpec extends Specification {

  import utils.query._
  import exceptions.InvalidQueryConditionException

  "ConditionParser.parseSingleCondition" should {

    import utils.query.ConditionParser.parseSingleCondition
    import utils.query.ConditionOperator._

    "retrieve the field, negated value, operator and values" in {
      parseSingleCondition("field=value").description must equalTo("field should be equal to value")

      parseSingleCondition("field!=value")
        .description must equalTo("field should not be equal to value")

      parseSingleCondition("field<>value")
        .description must equalTo("field should be not equal to value")
    }

    "return Missing operator when no operator is specified and the condition is negated" in {
      parseSingleCondition("field!value")
        .description must equalTo("field should not (missing operator!) value")
    }

    "handle missing parameters in 'between' operator as greater and less than" in {
      parseSingleCondition("field=value1..value2")
        .description must equalTo("field should be between value1 and value2")

      parseSingleCondition("field=..value2")
        .description must equalTo("field should be less than or equal to value2")

      parseSingleCondition("field=value1..")
        .description must equalTo("field should be greater than or equal to value1")

      parseSingleCondition("field=..") must throwA[InvalidQueryConditionException].like {
        case e => e.getMessage must contain("You have to specify value 'from' or 'to' when using between operator.")
      }

    }

    "handle in operator with multiples values" in {
      parseSingleCondition("field=value1|value2|value3")
        .description must equalTo("field should be one of value1, value2, value3")
    }

    "handle contains, begins and ends with operators" in {
      parseSingleCondition("field=*value1*")
        .description must equalTo("field should contain value1")

      parseSingleCondition("field=value1*")
        .description must equalTo("field should start with value1")

      parseSingleCondition("field=*value1")
        .description must equalTo("field should end with value1")
    }

    "handle operator $ as a synonim of contains" in {
      parseSingleCondition("field$value1")
        .description must equalTo("field should contain value1")

      parseSingleCondition("field!$value1")
        .description must equalTo("field should not contain value1")
    }


    "handle negated conditions, infering the correct operator" in {
      parseSingleCondition("field!value1..value2")
        .description must equalTo("field should not be between value1 and value2")

      parseSingleCondition("field!value1|value2|value3")
        .description must equalTo("field should not be one of value1, value2, value3")

      parseSingleCondition("field!value1*")
        .description must equalTo("field should not start with value1")

      parseSingleCondition("field!*value1")
        .description must equalTo("field should not end with value1")

      parseSingleCondition("field!*value1*")
        .description must equalTo("field should not contain value1")
    }

    "correctly parse the table" in {
      parseSingleCondition("table1.field!value1..value2")
        .prefix must equalTo("table1")

      parseSingleCondition("table1.field!value1..value2")
        .description must equalTo("table1.field should not be between value1 and value2")

      parseSingleCondition("field!value1..value2")
        .prefix must equalTo("")
    }

    "correctly parse and apply mappings on the table" in {
      val mappings = Map("table1"->"mapped1", "" -> "default")

      parseSingleCondition("table1.field!value1..value2").withMapping(mappings)
        .prefix must equalTo("mapped1")

      parseSingleCondition("table1.field!value1..value2").withMapping(mappings)
        .description must equalTo("mapped1.field should not be between value1 and value2")

      parseSingleCondition("table2.field!value1..value2").withMapping(mappings)
        .prefix must equalTo("table2")

      parseSingleCondition("field!value1..value2").withMapping(mappings)
        .prefix must equalTo("default")
    }

    "throw and exception if no field is defined" in {
      parseSingleCondition("=value") must throwA[InvalidQueryConditionException].like {
        case e => e.getMessage must contain("No field specified")
      }

      parseSingleCondition("field=") must throwA[InvalidQueryConditionException].like {
        case e => e.getMessage must contain("No value specified")
      }
    }

  }

  "ConditionParser.parse" should {

    import utils.query.ConditionParser.parse

    "retrieve multiple conditions parsed" in {
      def asDescriptions(conditions: List[Condition]): List[String] = {
        conditions.map(x => x.description)
      }

      asDescriptions(parse("field1=value1,field2=value2")) must equalTo(List(
        "field1 should be equal to value1",
        "field2 should be equal to value2"
      ))

      asDescriptions(parse("f1!v1..v2,f2>=v2,f3=*v3*,f4!v4a|v4b|v4c|v4d")) must equalTo(List(
        "f1 should not be between v1 and v2",
        "f2 should be greater than or equal to v2",
        "f3 should contain v3",
        "f4 should not be one of v4a, v4b, v4c, v4d"
      ))
    }

  }


}