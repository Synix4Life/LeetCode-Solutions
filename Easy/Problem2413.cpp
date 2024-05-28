/*
* Runtime: 3ms -> Beats 34.77% of users with Java
* Memory: 7.05MB -> Beats 80.77% of user with Java
*/

class Solution {
    public:
        int smallestEvenMultiple(int n) {
            return n%2 == 0 ? n : 2*n;
        }
};