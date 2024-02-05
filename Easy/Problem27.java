/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 41.23MB -> Beats 87.05% of user with Java
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int result=0;
        int pointer=0;
        for(int num:nums){
            if(num!=val){
                result++;
                nums[pointer] = num;
                pointer++;
            }
        }
        return result;
    }
}
