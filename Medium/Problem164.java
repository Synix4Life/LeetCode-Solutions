/*
* Runtime: 40ms -> Beats 72.19% of users with Java
* Memory: 60.59MB -> Beats 63.74% of user with Java
*/

class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxGap = 0;
        int tmp;
        for(int i = 0; i < nums.length - 1; i++){
            tmp = nums[i+1] - nums[i];
            if(tmp > maxGap){maxGap = tmp;}
        }
        return maxGap;
    }
}