/*
* Runtime: 0ms -> Beats 100.00% of users with Java
* Memory: 40.84MB -> Beats 24.12% of user with Java
*/

class Solution {
    public int kthFactor(int n, int k) {
        int id = 0;
        int res = -1;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                id++;
                if(id == k) return i;
            }
        }
        return res;
    }
}
