/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next == null)
        return null;
        ListNode slow = head;
        ListNode fast =head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = new ListNode();
        temp = head;
        while(temp.next!=slow)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

