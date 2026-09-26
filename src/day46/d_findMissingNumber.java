package day46;

public class d_findMissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return expected - sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}