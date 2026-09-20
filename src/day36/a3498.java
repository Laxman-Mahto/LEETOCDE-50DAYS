package day36;

public class a3498 {
    public static int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 'z' - s.charAt(i) + 1;
            sum += value * (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }
}