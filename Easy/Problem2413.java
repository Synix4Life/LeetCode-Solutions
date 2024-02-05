/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 39.82MB -> Beats 83.16% of user with Java
*/

class Solution {
    public int smallestEvenMultiple(int n) {
        return n%2==0 ? n : 2*n;
    }
}
