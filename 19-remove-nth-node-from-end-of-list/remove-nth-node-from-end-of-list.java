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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        if(n==size)
        {
            head = head.next;
            return head;
        }
        int nToDel = size-n;
        ListNode prev = new ListNode();
        prev = head;
        int i =1;
        while(i!=nToDel)
        {
            prev =prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}