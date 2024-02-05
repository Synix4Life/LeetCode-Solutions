/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 43.60MB -> Beats 10.82% of user with Java
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
