/*
* Runtime: 1ms -> Beats 62.86% of users with Java
* Memory: 40.00MB -> Beats 96.46% of user with Java
*/

class Solution {
    public boolean isThree(int n) {
        int three = 0;
        for(int i=1; i <= n; i++){
            three += (n%i==0) ? 1 : 0;
        }
        return (three == 3) ? true : false;
    }
}