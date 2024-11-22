/*
* Runtime: 10ms -> Beats 5.41% of users with Java
* Memory: 42.20MB -> Beats 9.52% of user with Java
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i=0; i<strs[0].length(); i++){
            for(String s: strs){
                if(i>=s.length() || s.charAt(i)!=strs[0].charAt(i))
                    return res;
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
}
