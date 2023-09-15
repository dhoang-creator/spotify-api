import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers

/*
  What elements should we use within our TestingFramework trait?
 */
trait TestingFramework extends AnyFunSpec
  with Matchers
  with weaver.FunSuite
