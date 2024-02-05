/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 41.92MB -> Beats 89.31% of user with Java
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int current=0;
        for(int i=0; i<nums.length; i++){
            current += nums[i];
            nums[i] = current;
        }
        return nums;
    }
}
