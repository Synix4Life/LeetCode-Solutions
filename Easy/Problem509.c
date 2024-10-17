/*
* Runtime: 6ms -> Beats 43.64% of users with C
* Memory: 7.71MB -> Beats 34.96% of user with C
*/

int fib(int n){
    if(n<=1){
        return n;
    }
    return fib(n-1) + fib(n-2);
}