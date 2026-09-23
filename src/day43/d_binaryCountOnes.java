package day43;

public class d_binaryCountOnes {
    public static int countSetBits(int n) {
        int c = 0;
        while (n > 0) {
            c += (n & 1);
            n >>= 1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(13));
    }
}