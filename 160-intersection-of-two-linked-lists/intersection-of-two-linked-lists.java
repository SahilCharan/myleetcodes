/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // while(headA!=null)
        // {
        //     ListNode temp = headB;
        //     while(temp!=null)
        //     {
        //         if(headA == temp)
        //         return headA;

        //         temp = temp.next;
        //     }
        //     headA= headA.next;
        // }
        // return null;
        
        int pathA = 0;
        int pathB =0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1!= null)
        {
            pathA++;
            temp1 = temp1.next;
        }
        while(temp2!= null)
        {
            pathB++;
            temp2 = temp2.next;
        }

        while(pathA>pathB)
        {
            pathA--;
            headA = headA.next;
        }

        while(pathB>pathA)
        {
            pathB--;
            headB = headB.next;
        }

        while(headA!= headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}