/*
* Runtime: 0ms -> Beats 100% of users with C++
* Memory: 26.00MB -> Beats 54.60% of user with C++
*/

class Solution {
public:
    int trap(vector<int>& height) {
        int l = 0;
        int r = height.size() - 1;
        int left_max = 0;
        int right_max = 0;
        int ans  = 0;
        while(l < r){
            if (height[l] <= height[r]){
                left_max = std::max(left_max, height[l]);
                ans += left_max - height[l];
                l++;
            } else {
                right_max = std::max(right_max, height[r]);    
                ans += right_max - height[r];
                r--;
            }
        }
        return ans;     
    }
};
