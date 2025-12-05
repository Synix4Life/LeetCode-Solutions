/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 43.38MB -> Beats 46.65% of user with Java
*/

class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int lhs = 0; 
        int rhs = 0;

        for(int i=0; i<nums.length; i++){rhs+=nums[i];}

        for(int i=0; i<nums.length-1; i++){
            lhs += nums[i];
            rhs -= nums[i];

            if((lhs & 1) == (rhs & 1)) count++;
        }
        return count;
    }
}
