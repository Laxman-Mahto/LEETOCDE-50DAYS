package day42;

import java.util.Arrays;

public class d_rotateArrayLeft {
    public static void rotateLeft(int[] arr) {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateLeft(arr);
        System.out.println(Arrays.toString(arr));
    }
}