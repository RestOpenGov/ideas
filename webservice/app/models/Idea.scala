package models

import play.api.Play.current
import play.api.db._

import anorm._
import anorm.SqlParser._

import utils.Validate
import play.api.i18n.Lang

import utils.Conversion.pkToLong

import java.util.Date

import play.Logger

case class Idea (

  val id: Pk[Long] = NotAssigned,

  val kind:         IdeaType = IdeaType(),
  val name:         String = "unknown idea",
  val description:  String = "no description",
  val author:       User = User(),
  val views:        Int = 0,
  val created:      Date = new Date()
)
  extends Entity
{

  lazy val votes: VoteCounter = VoteCounter.forIdea(this)

  def url():String = controllers.routes.Ideas.show(id.get).url
  def update()  (implicit lang: Lang) = Idea.update(this)
  def save()    (implicit lang: Lang) = Idea.save(this)
  def delete()  (implicit lang: Lang) = Idea.delete(this)

  def asSeq(): Seq[(String, Any)] = Seq(
    "id"              -> pkToLong(id),
    "idea_type_id"    -> kind.id.getOrElse(0L),
    "name"            -> name,
    "description"     -> description,
    "user_id"         -> author.id.getOrElse(0L),
    "views"           -> views,
    "created"         -> created
  )
}

object Idea extends EntityCompanion[Idea] {

  override def findById(id: Long): Option[Idea] = {
    super.findById(id).map { idea => 
      idea.copy(views = idea.views+1).update.fold(
        errors => None,
        idea => Option(idea)
      )
    }.getOrElse(None)
  }

  val table = "idea"

  override lazy val view = """
    |idea                                               inner join 
    |idea_type  on idea.idea_type_id = idea_type.id     inner join 
    |user       on idea.user_id = user.id""".stripMargin

  val defaultOrder = "name"

  val filterFields = List("name", "description")

  val saveCommand = """
    insert into idea (
      idea_type_id, name, description, user_id, views, created
    ) values (
      {idea_type_id}, {name}, {description}, {userId}, {views}, {created}
    )
  """

  val updateCommand = """
    update idea set
      idea_type_id  = {idea_type_id},
      name          = {name},
      description   = {description},
      user_id       = {user_id},
      views         = {views}
    where 
      id        = {id}
  """

  val simpleParser: RowParser[Idea] = {
    get[Pk[Long]]("idea.id") ~
    IdeaType.simpleParser ~ 
    get[String]("idea.name") ~
    get[String]("idea.description") ~
    User.simpleParser ~
    get[Int]("idea.views") ~
    get[Date]("idea.created") map {
      case id~kind~name~description~author~views~created => Idea(
        id, kind, name, description, author, views, created
      )
    }
  }

  val minParser: RowParser[Idea] = {
    get[Pk[Long]]("idea.id") ~
    get[String]("idea.name") ~
    get[String]("idea.description") ~
    get[Date]("idea.created") map {
      case id~name~description~created => Idea(
        id = id, name = name, description = description
      )
    }
  }

  def validate(idea: Idea)(implicit lang: Lang): List[Error] = {

    var errors = List[Error]()

    // idea type, should also validate foreign key!
    if (idea.kind.id == NotAssigned) {
      errors ::= ValidationError("type", "Idea type not specified")
    }

    // name
    if (Validate.isEmptyWord(idea.name)) {
      errors ::= ValidationError("name", "Name not specified")
    } else {
      if (isDuplicate(idea, "name")) {
        errors ::= ValidationError("name", "There already exists an idea with the name '%s'".format(idea.name))
      }
    }

    // description
    if (Validate.isEmptyWord(idea.description)) {
      errors ::= ValidationError("description", "Idea's description not specified")
    }

    // user, should also validate foreign key!
    if (idea.author.id == NotAssigned) {
      errors ::= ValidationError("user", "Author of the idea not specified")
    }

    errors.reverse
  }

}