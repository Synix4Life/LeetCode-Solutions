/*
* Runtime: 1ms -> Beats 99.47% of users with Java
* Memory: 56.69MB -> Beats 85.02% of user with Java
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i=0; i<nums.length; i++){
            tmp += nums[i];
            if(tmp > largest){
                largest = tmp;
            }
            if(tmp < 0){
                tmp = 0;
            }
        }
        return largest;
    }
}