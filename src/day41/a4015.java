package day41;

public class a4015 {
    public static int weightedSum(int[] values, int[] weights) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i] * weights[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] v = {2, 4, 6};
        int[] w = {1, 2, 3};
        System.out.println(weightedSum(v, w));
    }
}