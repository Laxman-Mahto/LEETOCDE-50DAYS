package day46;

public class a744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return letters[left % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }
}