package day48;

import java.util.Arrays;

public class d_copyArrayReverse {
    public static int[] copyReverse(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(copyReverse(arr)));
    }
}