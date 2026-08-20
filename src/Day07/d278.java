package Day07;

public class d278 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstBadVersion(5));
    }
    static class VersionControl {
        boolean isBadVersion(int version) {
            return false;
        }
    }

    static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
}
