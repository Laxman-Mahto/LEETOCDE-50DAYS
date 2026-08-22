package Day09;

public class a142 {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next;
        ListNode res = s.detectCycle(head);
        System.out.println(res != null ? res.val : null);
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    ListNode entry = head;
                    while (entry != slow) {
                        entry = entry.next;
                        slow = slow.next;
                    }
                    return entry;
                }
            }
            return null;
        }
    }
}
