package day41;

public class d_countOccurrences {
    public static int count(int[] arr, int target) {
        int c = 0;
        for (int num : arr) {
            if (num == target) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4, 5};
        System.out.println(count(arr, 2));
    }
}