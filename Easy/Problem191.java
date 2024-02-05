/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 39.99MB -> Beats 83.87% of user with Java
*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
