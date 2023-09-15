import org.junit.matchers.JUnitMatchers
import org.scalatest.{EitherValues, Inside, OptionValues}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.verbs.ShouldVerb

/*
  What elements should we use within our TestingFramework trait?
 */
trait TestingFramework extends AnyFunSpec
  with Matchers
  with ShouldVerb
  // check the Junit is included in the library dependencies
  with OptionValues
  // this allows you to Nest the data inside case classes
  with Inside
  with EitherValues
  // we need to inspect the JUnitMatchers further
  with JUnitMatchers
  with weaver.FunSuite
