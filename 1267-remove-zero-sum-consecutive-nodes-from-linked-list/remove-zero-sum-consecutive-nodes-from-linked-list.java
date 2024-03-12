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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode();
        dummy.next = head;
        int sum=0;

        ListNode node = dummy; 
        head = dummy; 
        while(head!=null){
            sum +=head.val;
            map.put(sum,head);

            head = head.next;
        } 
        sum=0;
        head = dummy;

        while(head!=null){
            sum +=head.val;
            head.next = map.get(sum).next;

            head = head.next;
        }

        return dummy.next;
    }
}