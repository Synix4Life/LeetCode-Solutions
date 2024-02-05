/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 41.02MB -> Beats 41.02% of user with Java
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length-1;
        digits[len] = digits[len]+1;
        while(digits[len]==10){
            digits[len]-=10;
            if(len<=0){
                return moveArray(digits);
            }
            digits[len-1]++;
            len--;
        }
        return digits;
    }
    private int[] moveArray(int[] digits){
        int[] newArray = new int[digits.length+1];
        newArray[0]=1;
        for(int i=0; i<digits.length; i++){
            newArray[i+1]=digits[i];
        }
        return newArray;
    }
}
