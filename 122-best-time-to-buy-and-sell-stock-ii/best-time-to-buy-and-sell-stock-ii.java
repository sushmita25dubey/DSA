class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit=0;
       //[7,1,5,3,6,4]
       //.      i
       //maxProfit= at 7>1 do not buy at 7. -> at 1<5 buy at 1 and sell at 5 mP=4 updated .-> at 5>3 do not buy move to next. -> at 3<6 buy at 3 & sell at 6 mP=3.now...4+3=7 which is our max profit.
       for(int i=1;i<prices.length;i++){
        if (prices[i]>prices[i-1]){
            maxProfit = maxProfit + prices[i] - prices[i -1];
        }
       }
        return maxProfit;      
    }
}

//T: O(n)
//S: O(1)