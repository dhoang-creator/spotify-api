import org.log4s.{Logger, getLogger}

trait Logs {
  private[this] val logger = getLogger

  import org.apache.logging.log4j._

  def debug(message: => String) = if (logger.isDebugEnabled) logger.debug(message)
  def debug(message: => String, ex: Throwable) = if (logger.isDebugEnabled) logger.debug(message, ex)
  def debugValue[T](valueName: String, value: => T): T = {
    val result: T = value
    debug(valueName + "==" + result.toString)
    result
  }

  def info(message: => String) = if (logger.isInfoEnabled) logger.info(message)
  def info(message: => String, ex: Throwable) = if (logger.isInfoEnabled) logger.info(message,ex)

  def warn(message: => String) = if (logger.isWarnEnabled) logger.warn(message)
  def warn(message: => String, ex: Throwable) = if (logger.isWarnEnabled) logger.warn(message, ex)

  // An additional method is added by the way of 'Fatal' with a similar structure with below but none for the likes of 'Trace'
  def error(ex: Throwable) = if (logger.isErrorEnabled) logger.error(ex.toString, ex)
  def error(message: => String) = if (logger.isErrorEnabled) logger.error(message)
  def error(message: => String, ex: Throwable) = if (logger.isErrorEnabled) logger.error(message,ex)
}
