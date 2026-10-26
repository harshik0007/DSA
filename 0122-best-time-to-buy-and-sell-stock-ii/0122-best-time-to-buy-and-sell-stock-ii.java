class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> s = new Stack<>();
        s.push(0);

        int buyPrice = prices[0];

        int maxprofit = 0;

        for(int i = 1; i < prices.length; i++){
            int curr = prices[i];

            while(!s.isEmpty() && prices[s.peek()] >= curr){
                s.pop();
            }

            if(s.isEmpty()){
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - prices[s.peek()];
                maxprofit += profit;
                s.pop();
            }

            s.push(i);
        }

        return maxprofit;
    }
}