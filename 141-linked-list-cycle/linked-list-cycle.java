/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
    if (head == null || head.next == null) {
        return false; // No cycle if there are less than two nodes
    }

    ListNode tortoise = head;
    ListNode hare = head;

    while (hare != null && hare.next != null) {
        tortoise = tortoise.next; // Move the slow pointer by one step
        hare = hare.next.next;   // Move the fast pointer by two steps

        if (tortoise == hare) {
            return true; // If they meet, there's a cycle
        }
    }

    return false; // If the fast pointer reaches the end, there's no cycle
}
}