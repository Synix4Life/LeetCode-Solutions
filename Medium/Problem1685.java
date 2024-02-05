/*
* Runtime: 3ms -> Beats 99.00% of users with Java
* Memory: 59.10MB -> Beats 26.65% of user with Java
*/

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int totalSum = 0;
        for(int n:nums){
            totalSum+=n;
        }
        int left = 0;
        int right = totalSum;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            right-=n;
            result[i]=n*i-left+right-n*(nums.length-i-1);
            left+=n;
        }
        return result;
    }
}
