package day41;

import java.util.Arrays;

public class c_reverseArray {
    public static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}