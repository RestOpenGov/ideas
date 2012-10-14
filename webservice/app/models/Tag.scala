package models

import play.api.Play.current
import play.api.db._

import anorm._
import anorm.SqlParser._

import utils.Validate._
import play.api.Play
import play.api.i18n.Lang

import utils.Http
import utils.Validate

import utils.Sql.sanitize

import utils.Conversion.pkToLong

import play.Logger

case class Tag (

  val id: Pk[Long] = NotAssigned,

  val name: String = "unknown tag",
  val description: String = "no description"
)
  extends Entity
{
  val url: String = id.map(controllers.routes.Tags.show(_).url).getOrElse("")
  def update()  (implicit lang: Lang) = Tag.update(this)
  def save()    (implicit lang: Lang) = Tag.save(this)
  def delete()  (implicit lang: Lang) = Tag.delete(this)
  
  def asSeq(): Seq[(String, Any)] = Seq(
    "id"            -> pkToLong(id),
    "name"          -> name,
    "description"   -> description
  )
}

object Tag extends EntityCompanion[Tag] {

  val table = "tag"

  val defaultOrder = "name"

  val filterFields = List("name", "description")

  val saveCommand = """
    insert into tag (
      name, description
    ) values (
      {name}, {description}
    )
  """

  val updateCommand = """
    update tag set
      name        = {name},
      description = {description}
    where 
      id          = {id}
  """

  def parser(as: String = "tag.") = {
    get[Pk[Long]]   (as + "id") ~
    get[String]     (as + "name") ~ 
    get[String]     (as + "description") map {
      case id~name~description => Tag(
        id, name, description
      )
    }
  }

  def validate(tag: Tag)(implicit lang: Lang): List[Error] = {

    var errors = List[Error]()
    
    // name
    if (Validate.isEmptyWord(tag.name)) {
        errors ::= ValidationError(Error.REQUIRED, "name", "validate.empty", &("tag.name"))
    } else {
      if (isDuplicate(tag, "name")) {
        errors ::= ValidationError("name", "There already exists an idea type with the name '%s'".format(tag.name))
      }
    }

    // description
    if (Validate.isEmptyWord(tag.name)) {
        errors ::= ValidationError(Error.REQUIRED, "description", "validate.empty", &("tag.description"))
    } else {
      if (isDuplicate(tag, "description")) {
        errors ::= ValidationError(Error.DUPLICATE, "name", 
          "validate.duplicate", &("tag"), &("tag.name"), tag.name)
      }
    }

    errors.reverse
  }

}