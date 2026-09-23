package day37;

public class a744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return letters[left % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));
    }
}//fdsfgdgsgsgdsdggdsgvfvdfxbfdgdf