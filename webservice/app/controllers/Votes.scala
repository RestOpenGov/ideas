package controllers

import play.api._
import play.api.mvc._

import models.{Vote, Error}
import anorm.Id

import play.api.libs.json.Json.toJson

import formatters.json.VoteFormatter._
import formatters.json.ErrorFormatter._

import scala.collection.immutable.Map
import utils.CORSAction
import utils.{JsonBadRequest, JsonNotFound, JsonOk}
import utils.Http

object Votes extends Controller {

  def list = CORSAction { request =>
    Ok(toJson(Vote.find(request.queryString)))
  }

  def count = CORSAction { request =>
    Ok(toJson(Vote.count(request.queryString)))
  }

  def show(id: Long) = CORSAction {
    Vote.findById(id).map { vote =>
      Ok(toJson(vote))
    }.getOrElse(JsonNotFound("Vote with id %s not found".format(id)))
  }

  def save() = CORSAction { implicit request =>
    request.body.asJson.map { json =>
      json.asOpt[Vote].map { vote =>
        vote.save.fold(
          errors => JsonBadRequest(errors),
          vote => Ok(toJson(vote).toString)
        )
      }.getOrElse     (JsonBadRequest("Invalid Vote entity"))
    }.getOrElse       (JsonBadRequest("Expecting JSON data"))
  }

  def update(id: Long) = CORSAction { implicit request =>
    request.body.asJson.map { json =>
      json.asOpt[Vote].map { vote =>
        vote.copy(id=Id(id)).update.fold(
          errors => JsonBadRequest(errors),
          vote => Ok(toJson(vote).toString)
        )
      }.getOrElse       (JsonBadRequest("Invalid Vote entity"))
    }.getOrElse         (JsonBadRequest("Expecting JSON data"))
  }

  def delete(id: Long) = CORSAction { implicit request =>
    Vote.delete(id)
    JsonOk("Vote successfully deleted","Vote with id %s deleted".format(id))
  }

}