/*
* Runtime: 11ms -> Beats 85.26% of users with Java
* Memory: 437.40MB -> Beats 32.76% of user with Java
*/

class Solution {
    private HashSet<Character> hashSet = new HashSet<>();

    private boolean isLower(char c)   { return c >= 'a' && c <= 'z'; }
    private boolean isUpper(char c)   { return c >= 'A' && c <= 'Z'; }
    private boolean isNum(char c)     { return c >= '0' && c <= '9';}
    private boolean isSpecial(char c) { return "!@#$".indexOf(c) != -1; }

    public int passwordStrength(String password) {
        int result = 0;
        for(char c : password.toCharArray()){
            if(hashSet.contains(c)) { continue; }
            else if(isLower(c))     { result += 1; }
            else if(isUpper(c))     { result += 2; }
            else if(isNum(c))       { result += 3; }
            else if(isSpecial(c))   { result += 5; }
            hashSet.add(c);
        }
        return result;
    }
}