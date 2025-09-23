package b_arrayInJava;

public class stockBuySell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,4,4};
        int maxPrice = 0;
        int bestBuy = prices[0];
        for (int i = 1; i < prices.length-1; i++) {
            if (prices[i]>bestBuy){
                maxPrice = Math.max(maxPrice,prices[i]-1);
            }
            bestBuy = Math.min(bestBuy,prices[i]);
        }
        System.out.println("Max Prices: "+maxPrice);
    }
}
