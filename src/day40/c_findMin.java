package day40;

public class c_findMin {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {15, 3, 9, 21, 1};
        System.out.println(findMin(arr));
    }
}