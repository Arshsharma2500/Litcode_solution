class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sumMoney=prices[0]+prices[1];
        if(sumMoney>money){
            return money;
        }
        return money-sumMoney;
    }
}