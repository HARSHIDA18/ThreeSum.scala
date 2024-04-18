import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ThreeSumTesting extends AnyFlatSpec with Matchers {
  val threeSum=new ThreeSum
  "threeSumClosest" should "return the closest sum to the target" in {
    val nums1 = Array(-1, 2, 1, -4)
    val target1 = 1
    threeSum.threeSumClosest(nums1, target1) shouldEqual 2
    val nums2 = Array(1, 1, 1, 0)
    val target2 = -100
    threeSum.threeSumClosest(nums2, target2) shouldEqual 2
  }
}
