# `histdating`


A cross platform library for working with historical datings.

## Background

Ancient historians do not work with directly observed dates:  they work with judgments based on complex and often incomplete evidence.  I use the term *dating for these judgments.  When we say that "Xerxes invaded Greece in 480 BCE," it is a dating that rests on far more complex networks of historical information than when we see, "Japan bombed Pearl Harbor in 1941."

This library provides representations of datings that can be manipulated in a variety of ways.


## Sketch

-   A point is a `DateTime` object.  It therefore may have any degree of precision from year to millisecond.
-   A point has a precision qualifier:  this is a JodaTime (Period/Interval?)
-   A point may have a range qualifier: `taq` or `tpq`
-   A range is a pair of points.
-   Datings are ither points or a range.
