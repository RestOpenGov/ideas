package formatters.json

import play.api.libs.json.Json.toJson
import play.api.libs.json.JsValue
import play.api.libs.json.Format
import play.api.libs.json.JsUndefined

import java.util.Date
import java.text.SimpleDateFormat

import utils.Conversion.toDate
import play._


object DateFormatter {

  implicit object JsonDateFormatter extends Format[Option[Date]] {

    val dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'")

    def writes(date: Option[Date]): JsValue = {
      toJson(
        date.map(
          date => dateFormat.format(date)
        ).getOrElse(
          ""
        )
      )
    }

    def reads(j: JsValue): Option[Date] = {
      if (j.isInstanceOf[JsUndefined]) { 
        None
      } else {
        toDate(j.as[String], "yyyy-MM-dd'T'hh:mm:ss'Z'")
      }
    }
  }

}
