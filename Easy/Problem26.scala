/*
* Runtime: 566ms -> Beats 44.58% of users with Scala
* Memory: 56.14MB -> Beats 69.88% of user with Scala
*/

object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        if (nums.isEmpty) return 0
  
        var index = 0
        for (i <- 1 until nums.length) {
            if (nums(i) != nums(index)) {
                index += 1
                nums(index) = nums(i)
            }
        }
    
        index + 1
    }
}
