/*
* Runtime: 1ms -> Beats 56.94% of users with Java
* Memory: 39.59MB -> Beats 97.12% of user with Java
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0){
            for(int i=0; i<32; i++){
                if(Math.pow(2, i)==n){
                    return true;
                }
            }
        }
        else{
            for(int i=0; i>-32; i--){
                if(Math.pow(2, i)==n){
                    return true;
                }
            }
        }
        return false;
    }
}
