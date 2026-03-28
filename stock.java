public class stock {
    public static int maxProfit(int[]prices){
        int maxProfit=0;
        int buyPrice=prices[0];
        int sellPrice=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice>prices[i]) {
                buyPrice=prices[i];
            }else if (maxProfit<(prices[i]-buyPrice)) {
                    sellPrice=prices[i];
                    maxProfit=prices[i]-buyPrice;
                }
        }
        System.out.println("buy at "+buyPrice);
        System.out.println("Sell @ "+ sellPrice);
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,4,5,8,3};
        System.out.println("Max profit that can b Achievd is : "+maxProfit(prices));
    }    
}
