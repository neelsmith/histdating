package edu.holycross.shot.histdating
import scala.scalajs.js
import scala.scalajs.js.annotation._

import com.github.nscala_time.time._
import org.joda.time._



/**
*/
@JSExportAll case class Point (val dt: DateTime, val bounding: Option[RangeBoundary], val precision: Period  ) {
}

//int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis

object Point {

  def apply(instantString: String, bound: Option[RangeBoundary] = None, precision: Period = yearPeriod ): Point = {
    Point(Instant.parse(instantString).toDateTime(), bound, precision)
  }
}
