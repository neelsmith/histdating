package edu.holycross.shot.histdating
import scala.scalajs.js
import scala.scalajs.js.annotation._


sealed trait RangeBoundary { def name: String}

case object TAQ extends RangeBoundary { val name = "terminus ante quem"}

case object TPQ extends RangeBoundary { val name = "terminus post quem"}
