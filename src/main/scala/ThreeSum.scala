class ThreeSum {
    def threeSumClosest(nums: Array[Int], target: Int): Int = {
      val sortedNums=nums.sorted
      @scala.annotation.tailrec
      def ans(i:Int,j:Int,k:Int,result:Int):Int={
        if   (i>sortedNums.length -2) result
        else if   (j>=k)   ans(i+1,i+2,sortedNums.length-1,result)
        else
        {
          val currSum= sortedNums(i)+sortedNums(j)+sortedNums(k)
          val mini= if   (Math.abs(currSum-target)<Math.abs(result-target)) currSum else result
          if   (currSum<target) ans(i,j+1,k,mini)
          else if   (currSum>target)   ans(i,j,k-1,mini)
          else ans(i,j+1,k-1,mini)
        }
      }
      ans(0,1,sortedNums.length-1,sortedNums(0)+sortedNums(1)+sortedNums.last)
    }
}
