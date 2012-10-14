package test.models

import org.specs2.mutable._
import org.specs2.mutable.After

import play.api.test._
import play.api.test.Helpers._

class IdeaTagSpec extends org.specs2.mutable.Specification {

  import models.{Idea, Tag}

  "Tag.findByIdea" should {

    "should retrieve the tags for an idea" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase())) {

        val tags = Tag.findByIdea(Idea.findById(1).get)

        tags.size must equalTo(2)
        tags(0).name must equalTo("internet")
        tags(1).name must equalTo("tecnología")
      }
    }

    "should retrieve an empty list of tags for a new idea" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase())) {

        val tags = Tag.findByIdea(Idea())

        tags.size must equalTo(0)
      }
    }

  }

  "Idea.tags" should {

    "should retrieve a list of tag names for the idea" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase())) {

        ( Idea.findById(1).get.tags.toString 
          must equalTo(List[String]("internet, tecnología").toString)
        )
      }
    }

    "should retrieve an empty List of tag names" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase())) {

        Idea().tags must equalTo(List[String]())
      }
    }

  }

}