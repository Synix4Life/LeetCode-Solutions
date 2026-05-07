/*
* Runtime: 0ms -> Beats 100% of users with C
* Memory: 15.34MB -> Beats 43.43% of user with C
*/

int max(int a, int b){
    return a > b ? a : b;
}

int maxProfit(int* prices, int pricesSize) {
    int buy = prices[0];
    int profit = 0;

    for(int i=1; i<pricesSize; i++){
        if(buy > prices[i]){
            buy = prices[i];
        }
        profit = max(profit, prices[i]- buy);
    }

    return profit;
}
