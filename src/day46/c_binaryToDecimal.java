package day46;

public class c_binaryToDecimal {
    public static int toDecimal(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 2 + (s.charAt(i) - '0');
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("1010"));
    }
}