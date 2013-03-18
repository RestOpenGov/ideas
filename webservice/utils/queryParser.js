
var tests = [
  "id=3",
  "type.id=3",
  "idea.type.id<>1",
  "idea.type.id=1..3",
  "idea.type.id=1..",
  "idea.type.id=..3",
  "idea.type.id>=3",
  "idea.type.id=3|4",
  "idea.type.name=*test*",
  "idea.type.name=*test",
  "idea.type.name=test*"
];

for(var i in tests) {
  console.log(tests[i] + ": " + parseCondition(tests[i]));
}




function parseCondition(condition) {
  if(condition.length > 0) {

    var conditionRegExp = /^(?:([\w|\.]*)\.)?([\w-]*)[:]?(!?)(=|:|\$|<=|>=|<>|<|>|){1,}(.*)$/;
    matches = condition.match(conditionRegExp);

    var parsed = {
      condition: matches[0],
      prefix: matches[1] === undefined ? matches[1] : "",
      field: matches[2],
      negated: matches[3],
      operator: matches[4],
      value: matches[5]
    };

    if(parsed.field.length === 0) {
      console.error("Error parsing query condition. No field specified.");
    }

    if(parsed.value.length === 0) {
      console.error("Error parsing query condition. No value specified.");
    }

    var field = parsed.field,
        negated = parsed.negated === "!",
        operator = toSqlOperator(parsed.operator, parsed.value);

    return operator;

  }
}




function toSqlOperator(parsedOperator, parsedValue) {
  parsedOperator = parsedOperator.toLowerCase();

  var result = "";

  if(parsedOperator === "equal" || parsedOperator === "=" || parsedOperator === ":") {
    result = "=";
  }
  else if(parsedOperator === "notequal" || parsedOperator === "!=" || parsedOperator === "!:" || parsedOperator === "<>") {
    result = "<>";
  }
  else if(parsedOperator === "greaterorequal" || parsedOperator === ">=") {
    result = ">=";
  }
  else if(parsedOperator === "greater" || parsedOperator === ">") {
    result = ">";
  }
  else if(parsedOperator === "lessorequal" || parsedOperator === "<=") {
    result = "<=";
  }
  else if(parsedOperator === "less" || parsedOperator === "<") {
    result = "<";
  }
  else if(parsedOperator === "between") {
    result = "BETWEEN %s AND %s";
  }
  else if(parsedOperator === "in") {
    result = "IN(%s)";
  }
  else if(parsedOperator === "startswith") {
    result = "LIKE '%s*'";
  }
  else if(parsedOperator === "endswith") {
    result = "LIKE '*%s'";
  }
  else if(parsedOperator === "contains" || parsedOperator === "$") {
    result = "LIKE '*%s*'";
  }

  if(result === "=" || result.length === 0) {

    var betweenMatch        = parsedValue.match(/^(\w*)\.\.(\w*)$/),
        inMatch             = parsedValue.match(/^(.*\|.*)$/),
        containsMatch       = parsedValue.match(/^\*(.*)\*$/),
        startsWithMatch     = parsedValue.match(/^(.*)\*$/),
        endsWithRegExpMatch = parsedValue.match(/^\*(.*)$/);

    if(betweenMatch) {
      if(betweenMatch[1].length > 0 && betweenMatch[2].length > 0) {
        result = "BETWEEN " + betweenMatch[1] + " AND " + betweenMatch[2];
      }
      else if(betweenMatch[1].length > 0) {
        result = ">=";
      }
      else if(betweenMatch[2].length > 0) {
        result = "<=";
      }
      else {
        console.error("Error parsing query condition. You have to specify value 'from' or/and 'to' when using between operator.");
      }
    }
    else if(inMatch && inMatch[1].length > 0) {
      result = "IN(" + inMatch[1].split('|').join(',') + ")";
    }
    else if(containsMatch && containsMatch[1].length > 0) {
      result = "LIKE '%" + containsMatch[1] + "%'";
    }
    else if(startsWithMatch && startsWithMatch[1].length > 0) {
      result = "LIKE '" + startsWithMatch[1] + "%'";
    }
    else if(containsMatch && containsMatch[1].length > 0) {
      result = "LIKE '%" + containsMatch[1] + "'";
    }

  }

  return result;
}






