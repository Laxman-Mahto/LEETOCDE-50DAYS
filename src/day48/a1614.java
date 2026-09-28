package day48;

public class a1614 {
    public static int maxDepth(String s) {
        int depth = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                depth++;
                max = Math.max(max, depth);
            } else if (c == ')') {
                depth--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}