/*
* Runtime: 6ms -> Beats 26.61% of users with Java
* Memory: 44.19MB -> Beats 46.97% of user with Java
*/

class Solution {
    private int[] integerToArray(int x){
        String s = Integer.toString(x);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int[] xString = integerToArray(x);
        int left = 0; 
        int right = xString.length-1;
        while(left < right){
            if(xString[left] != xString[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
