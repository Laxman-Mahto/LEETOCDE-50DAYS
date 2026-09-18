package day38;

public class d_countEvenOdd {
    public static void printCounts(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printCounts(arr);
    }
}