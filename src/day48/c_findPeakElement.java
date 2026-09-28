package day48;

public class c_findPeakElement {
    public static int findPeak(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean leftOk = (i == 0 || arr[i] >= arr[i - 1]);
            boolean rightOk = (i == arr.length - 1 || arr[i] >= arr[i + 1]);
            if (leftOk && rightOk) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        System.out.println(findPeak(arr));
    }
}