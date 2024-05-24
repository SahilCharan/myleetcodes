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
        ListNode temp = head;
        int size =0;
        while(temp!=null)
        {
            size++;
            temp =  temp.next;
        }
         if(n==size)
        return head.next;
        int indexToReach = size-n;
        
        int i =1;
        ListNode prev = head;
        while(i<indexToReach)
        {
            prev =  prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

        
    }
}