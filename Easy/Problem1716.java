/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 39.33MB -> Beats 69.58% of user with Java
*/

class Solution {
    public int totalMoney(int n) {
        return rec(0,n);
    }

    private int rec(int week, int n){
      int res = 0;
      for(int i=1; i<=7; i++){
        if(i>n){
          break;
        }
        res += (i+week);
      }
      return res+ (n<=7? 0: rec(week+1, n-7));
    }
}
