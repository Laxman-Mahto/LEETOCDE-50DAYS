package day43;

public class b_secondLargest {
    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 19};
        System.out.println(secondLargest(arr));
    }
}