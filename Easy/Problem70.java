/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 40.65MB -> Beats 26.92% of user with Java
*/

class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int last = 3;
        int secondLast = 2;
        int current = 0;
        for(int i=3; i<n; i++){
            current = last + secondLast;
            secondLast = last;
            last = current;
        }
        return current;
    }
}