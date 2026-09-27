package day47;

public class b_countEvenOdd {
    public static void count(int[] arr) {
        int e = 0, o = 0;
        for (int num : arr) {
            if (num % 2 == 0) e++;
            else o++;
        }
        System.out.println("Evens: " + e + ", Odds: " + o);
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        count(arr);
    }
}