/*
* Runtime: 7ms -> Beats 31.80% of users with C++
* Memory: 54.96MB -> Beats 84.61% of user with C++
*/

class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        
        int result = 1;
        for(int n : nums){
            if(n == result) result++;
            else if(n > result) break;
        }
        return result;
    }
};
