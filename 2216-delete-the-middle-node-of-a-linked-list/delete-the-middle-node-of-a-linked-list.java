//Definition for singly-linked list.
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }

        // head = [1,2,3,4]
        ListNode fast = head.next.next; // [3,4]
        ListNode slow = head; // [1,2,3,4]
        
        while(fast != null && fast.next != null){ 
            fast = fast.next.next; // []
            slow = slow.next; // [2,3,4] 
        }
        
        slow.next =  slow.next.next; // [3, 4] = [4]

        return head;
    }
}