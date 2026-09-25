package day45;

public class c_lastOccurrence {
    public static int lastOccur(int[] arr, int target) {
        int l = 0, r = arr.length - 1, res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        System.out.println(lastOccur(arr, 2));
    }
}