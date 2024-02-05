/*
* Runtime: 2166ms -> Beats 5.21% of users with Java
* Memory: 39.44MB -> Beats 90.91% of user with Java
*/

class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = 0;
        if(num==1){return false;}
        for(int i=1; i<=(num/2)+1;i++){
            if(num%i==0){
                n+=i;
            }
        }
        return n==num;
    }
}
