public class BuyAndSellStock{
    public static void method(int[] price){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            } else{
                buyPrice = price[i];
            }
        }
        System.out.println("Maximus profit of the stocx : " + maxProfit);
    }
    public static void main(String[] rags){
        int[] price = {7,1,5,3,6,4};
        method(price);
    }
}