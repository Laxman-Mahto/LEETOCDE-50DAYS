package day44;

public class a4018 {
    public static int interactionCost(int[] groupA, int[] groupB) {
        int cost = 0;
        for (int a : groupA) {
            for (int b : groupB) {
                cost += Math.abs(a - b);
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2, 4};
        System.out.println(interactionCost(a, b));
    }
}