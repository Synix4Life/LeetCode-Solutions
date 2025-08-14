/*
* Runtime: 1ms -> Beats 99.73% of users with Java
* Memory: 42.08MB -> Beats 66.29% of user with Java
*/

class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        for(int i=1; i<s.length(); i++){
            result += Math.abs((int) s.charAt(i-1) - (int) s.charAt(i));
        }
        return result;
    }
}
