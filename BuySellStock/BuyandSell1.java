public class BuyandSell1 {
    public static int Profit(int prices[]){
        int max = 0;
        int buyprice = Integer.MAX_VALUE;

        for(int i =0 ; i<prices.length ;i++){
            if (prices[i] > buyprice) {
                int profit = prices[i] - buyprice;
                max = Math.max(max, profit);
            } else {
               buyprice = prices[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        System.out.println(Profit(prices));
    }
}
