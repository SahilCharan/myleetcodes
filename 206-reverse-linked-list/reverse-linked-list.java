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

        // I can solve it using stack. 
        // what i will be doing is, adding all the element in the stack
        // then i am going creat a new list node 
        // and connecting it to the list by popping the element from the stack, and the loop will run tiull the stack is non empty

        // otheer way is:

        ListNode prev = null;
        ListNode temp = head;
        //1->2->3->4
        while(temp!= null)
        {
            ListNode current  =  temp.next; //curr = 1,2,3,4
            temp.next = prev; // 3,2,1->null
            prev = temp; // prev 1,2,3,4;
            
            temp = current; //temp =4

        }
        return prev;
        
    }
}