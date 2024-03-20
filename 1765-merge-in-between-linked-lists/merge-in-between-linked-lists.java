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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp  = list1;
        ListNode temp2 = list2;
        int index1 =0;
        int index2=0;
        while(temp!=null && index2 <=b)
        {
            temp =temp.next;
            index2++;

        }
        while(temp2.next!=null)
        {
            temp2 = temp2.next;
        }
        temp2.next = temp;
        ListNode temp1 = list1;
        while(temp1!=null&&index1<a-1)
        {
            temp1  = temp1.next;
            index1++;
        }
        temp1.next = list2;

        return list1;
        
    }
}