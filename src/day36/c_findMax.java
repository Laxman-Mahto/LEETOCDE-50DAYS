package day36;

public class c_findMax {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 18, 5, 90, 12};
        System.out.println(findMax(arr));
    }
}