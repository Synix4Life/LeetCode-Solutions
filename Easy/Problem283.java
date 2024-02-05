/*
* Runtime: 2ms -> Beats 82.28% of users with Java
* Memory: 44.60MB -> Beats 99.46% of user with Java
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        int tmp;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                tmp = nums[pointer];
                nums[pointer]=nums[i];
                nums[i]=tmp;
                pointer++;
            }
        }
    }
}
