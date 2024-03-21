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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        //gettting the tail of the linkedlist
        while(temp!=null)
        {
            temp = temp.next;
        }
        //now i am standing on the tail of the linkedlist
        ListNode prev = null;
        ListNode curr = temp= head;
        ListNode nexts;
        while(curr!=null)
        {
            nexts = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexts;
        }
        head = prev;

        return head;
    }
}