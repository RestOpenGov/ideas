package utils

import play.api.http.Status
import play.api.libs.json.Json._
import models.Error

import play.api.mvc.Results

import formatters.json.ErrorFormatter._

object JsonBadRequest {
  def apply(message: String = "Bad request error", developerMessage: String = "Bad request error",
            status: Int = Status.BAD_REQUEST, errorCode: Int = 10000
  ) = {
    Results.BadRequest(toJson(Error(status, errorCode, message, developerMessage)))
  }
  def apply(errors: List[Error]) = {
    Results.BadRequest(toJson(errors))
  }
  def apply(error: Error) = {
    Results.BadRequest(toJson(error))
  }
}

object JsonOk {
  def apply(message: String = "Operation successful", developerMessage: String = "Operation successful",
            status: Int = Status.OK, errorCode: Int = 0
  ) = {
    Results.Ok(toJson(
      Error(status = status, errorCode = errorCode, message = message, developerMessage = developerMessage)
    ))
  }
}

object JsonNotFound {
  def apply(message: String = "Not found", developerMessage: String = "Not found",
            status: Int = Status.NOT_FOUND, errorCode: Int = 0
  ) = {
    Results.NotFound(toJson(Error(status = status, errorCode = errorCode, message = message, developerMessage = developerMessage)))
  }
  def apply(error: Error) = {
    Results.NotFound(toJson(error))
  }
}

object JsonUnauthorized {
  def apply(message: String = "Unauthorized", developerMessage: String = "Unauthorized access",
            status: Int = Status.UNAUTHORIZED, errorCode: Int = 0
  ) = {
    Results.Unauthorized(toJson(Error(status = status, errorCode = errorCode, message = message, developerMessage = developerMessage)))
  }
  def apply(errors: List[Error]) = {
    Results.Unauthorized(toJson(errors))
  }
}

