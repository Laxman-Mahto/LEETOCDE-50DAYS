package day48;

public class b_binarySearchRecursive {
    public static int search(int[] arr, int l, int r, int target) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return search(arr, mid + 1, r, target);
        return search(arr, l, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 10, 15};
        System.out.println(search(arr, 0, arr.length - 1, 10));
    }
}