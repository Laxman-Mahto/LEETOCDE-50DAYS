package day40;

public class b_linearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 3};
        System.out.println(search(arr, 9));
    }
}