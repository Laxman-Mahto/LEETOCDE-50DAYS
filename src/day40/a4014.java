package day40;

public class a4014 {
    public static int minTotalPrice(int[] prices, int discount) {
        int total = 0;
        for (int p : prices) {
            total += Math.max(0, p - discount);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] prices = {10, 20, 30, 40};
        System.out.println(minTotalPrice(prices, 5));
    }
}