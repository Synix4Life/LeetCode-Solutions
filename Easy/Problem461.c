/*
* Runtime: 0ms -> Beats 100% of users with C
* Memory: 7.76MB -> Beats 81.77% of user with C
*/

int hammingDistance(int x, int y) {
    return __builtin_popcount(x ^ y);
}
