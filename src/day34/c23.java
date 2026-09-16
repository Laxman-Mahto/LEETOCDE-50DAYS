package day34;

import java.util.PriorityQueue;

public class c23 {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        ListNode[] lists = {l1, l2};
        ListNode res = s.mergeKLists(lists);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
            for (ListNode node : lists) {
                if (node != null) {
                    pq.offer(node);
                }
            }
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            while (!pq.isEmpty()) {
                ListNode node = pq.poll();
                curr.next = node;
                curr = curr.next;
                if (node.next != null) {
                    pq.offer(node.next);
                }
            }
            return dummy.next;
        }
    }
}
