package day20;

import java.util.ArrayList;
import java.util.List;

public class c17 {
    static class Solution {
        private static final String[] MAPPING = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        public List<String> letterCombinations(String digits) {
            List<String> result = new ArrayList<>();
            if (digits == null || digits.isEmpty()) {
                return result;
            }
            backtrack(0, digits, new StringBuilder(), result);
            return result;
        }

        private void backtrack(int index, String digits, StringBuilder current, List<String> result) {
            if (index == digits.length()) {
                result.add(current.toString());
                return;
            }
            String letters = MAPPING[digits.charAt(index) - '0'];
            for (int i = 0; i < letters.length(); i++) {
                current.append(letters.charAt(i));
                backtrack(index + 1, digits, current, result);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}
