/*
  This block of code is simply for the Logger instance rather than having it placed within the Main Object
 */

class MyClass(val data: Map[String, Int]) {
  private[this] val logger = org.log4s.getLogger

  logger.debug("Constructing new instance of MyClass")
  logger.trace(s"New instance's data set: $data") // the reason this class has a parameter is because of this line ... should loggers work for individual methods or just classes and objects

  logger trace {
    def helper(s: String) = ???
    val x = ...
    val y = helper(...)
    s"Combined trace message for $x: $y"
  }

  /*
    The question thus becomes:
    1. Where are the log messages stored when an exception occurs?
    2. What are the best practices with regards to logging within an application?
    3. How do we test logger behaviour?
    4. Once an error occurs, how do we find the logs and start the process of debugging it?
   */
  try {

  } catch {
    case e: Exception => logger.error(e)("Some error message")
  }

}
