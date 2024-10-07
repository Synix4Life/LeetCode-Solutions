/*
* Runtime: 2ms -> Beats 61.02% of users with Java
* Memory: 41.45MB -> Beats 39.92% of user with Java
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        for(int i=0; i<t.length(); i++){
            if(sPointer >= s.length()){ return true; }
            if(s.charAt(sPointer) == t.charAt(i)){
                sPointer++;
            }
        }
        return (sPointer >= s.length()) ? true :false;
    }
}
