package day50;

import java.util.Arrays;

public class a1111 {
    public static int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                ans[i] = depth % 2;
            } else {
                ans[i] = depth % 2;
                depth--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String seq = "(()())";
        System.out.println(Arrays.toString(maxDepthAfterSplit(seq)));
    }
}