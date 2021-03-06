package formatters.json

import play.api.libs.json.Format
import play.api.libs.json.JsValue
import play.api.libs.json.Json.toJson

import java.util.Date

import models.User

import anorm._

import PkFormatter._
import DateFormatter._

object UserFormatter {

  implicit object JsonUserFormatter extends Format[User] {

    def writes(o: User): JsValue = {
      toJson( Map(
        "url"         -> toJson(o.url),
        "id"          -> toJson(o.id),
        "nickname"    -> toJson(o.nickname),
        "name"        -> toJson(o.name),
        "email"       -> toJson(o.email),
        "avatar"      -> toJson(o.avatar),
        "created"     -> toJson(Option(o.created))
      ))
    }

    def reads(j: JsValue): User = {
      User(
        id          = (j \ "id").as[Option[Pk[Long]]]       .getOrElse(NotAssigned),
        nickname    = (j \ "nickname").as[Option[String]]   .getOrElse(""),
        name        = (j \ "name").as[Option[String]]       .getOrElse(""),
        email       = (j \ "email").as[Option[String]]      .getOrElse(""),
        avatar      = (j \ "avatar").as[Option[String]]     .getOrElse(""),
        created     = (j \ "created").as[Option[Date]]      .getOrElse(new Date())
      )
    }

  }

}