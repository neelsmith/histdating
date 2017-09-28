
package edu.holycross.shot.histdating


import com.github.nscala_time.time._
import org.joda.time._

import org.scalatest.FlatSpec


class PointSpec extends FlatSpec {

  "The Point object" should "construct a point with precision and boundingstate from a DateTime String" in {
    val pt = Point("10")
    pt.dt match {
      case dateTime: DateTime => assert(true)
      case _ => fail("Point did not have a date time")
    }
    assert(pt.bounding == None)
    assert(pt.precision == yearPeriod)
  }



}
