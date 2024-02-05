/*
* Runtime: 88ms -> Beats 7.09% of users with Java
* Memory: 44.28MB -> Beats 79.62% of user with Java
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if((nums[i]+nums[j])==target && i!=j){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }   
        }
        return null;
    }
}
