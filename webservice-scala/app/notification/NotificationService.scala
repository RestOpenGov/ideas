package notification 

import akka.actor.ActorRef
import akka.actor.Props
import akka.actor.ActorLogging
import play.api.db._
import anorm._
import play.api.Play.current

import javax.mail._
import javax.mail.internet._
import javax.mail.Authenticator
import javax.mail.PasswordAuthentication
import java.util.Properties
import notification.mailTemplates.NewCommentMailTemplate
import models.User
import play.Logger
import play.api.libs.concurrent.Akka
import play.api.Play.current
import akka.actor.Props
import akka.routing.RoundRobinRouter
import akka.util.duration._


case class NewCommentNotification(idea: Long, authorName: String, commentText: String, authorAvatar: String)

case class NewIdeaNotification()

case class NewVoteNotification()

case class NewUserNotification()

case class ReportNotification()




object NotificationService {

	val log = Logger.of("application");
	
	val notificatorActor = {
		log.info("Starting notification service.")
	    val props = Props[NotificationActor].withRouter(RoundRobinRouter(nrOfInstances = 10))
    	Akka.system.actorOf(props, name = "notificationActor");
	}

	val reportActor = {
	    val props = Props[ReportActor].withRouter(RoundRobinRouter(nrOfInstances = 1))
    	Akka.system.actorOf(props, name = "reportActor");
	}

	def apply(message: Any) = {
		log.debug("Sending notification: " + message)
		notificatorActor ! message
		reportActor ! message
	}
}

