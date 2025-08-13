/*
* Runtime: 7ms -> Beats 100.0% of users with Java
* Memory: 44.63MB -> Beats 5.66% of user with Java
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}

/*
* Explanation: 
* 3^20 > 2^31 -1 (max int)
* Therefore, the largest power of 3 in int range is 3^19.
* Furthermore, all positive powers of 3 are divisors of 3^19, so if 3^19 mod n == 0, n must be a power of 3.
*/

