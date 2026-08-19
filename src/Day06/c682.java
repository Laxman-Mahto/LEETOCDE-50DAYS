package Day06;

import java.util.ArrayList;
import java.util.List;

public class c682 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(s.calPoints(ops));
    }
    static class Solution {
        public int calPoints(String[] operations) {
            List<Integer> record = new ArrayList<>();
            for (String op : operations) {
                if (op.equals("+")) {
                    record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
                } else if (op.equals("D")) {
                    record.add(record.get(record.size() - 1) * 2);
                } else if (op.equals("C")) {
                    record.remove(record.size() - 1);
                } else {
                    record.add(Integer.parseInt(op));
                }
            }
            int total = 0;
            for (int score : record) {
                total += score;
            }
            return total;
        }
    }
}
