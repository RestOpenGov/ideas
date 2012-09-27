package models

import play.api.http.Status

import play.api.i18n.{Messages, Lang}

case class Error(
  val status: Int = Status.INTERNAL_SERVER_ERROR,
  val errorCode: Int = 10000,
  val field: String = "",
  val message: String = "Error performing operation",
  val developerMessage: String = "Error performing operation"
)

object ValidationError {
  def apply(message: String) = {
    Error(status = Status.BAD_REQUEST, message = message)
  }

  def apply(field: String, message: String, args: Any*)(implicit lang: Lang) = {
    Error(status = Status.BAD_REQUEST, field = field, message = Messages(message, args: _*))
  }

  // def apply(field: String, message: String, developerMessage: String) = {
  //   Error(status = Status.BAD_REQUEST, field = field, message = message, 
  //     developerMessage = developerMessage
  //   )
  // }

}

