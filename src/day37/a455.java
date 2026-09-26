//455 leetcode problem statement
package day37;
import java.util.Arrays;

public class a455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        System.out.println(findContentChildren(g, s));
    }
}