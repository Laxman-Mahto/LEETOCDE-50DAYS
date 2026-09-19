package day39;

public class c_binaryToDecimal {
    public static int toDecimal(String binary) {
        int ans = 0;
        for (int i = 0; i < binary.length(); i++) {
            ans = ans * 2 + (binary.charAt(i) - '0');
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("1101"));
    }
}