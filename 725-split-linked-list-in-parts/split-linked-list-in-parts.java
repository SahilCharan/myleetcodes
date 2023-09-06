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
    public ListNode[] splitListToParts(ListNode head, int k) {
         int length = 0;
    ListNode current = head;
    while (current != null) {
        length++;
        current = current.next;
    }

    // Step 2: Calculate the size of each part and the number of extra nodes
    int partSize = length / k;
    int extraNodes = length % k;

    // Initialize the result array to store the k parts
    ListNode[] parts = new ListNode[k];

    // Step 3: Iterate through the linked list to split it into k parts
    current = head;
    ListNode previous = null;

    for (int i = 0; i < k; i++) {
        parts[i] = current; // Store the head of the current part

        int partLength = partSize + (i < extraNodes ? 1 : 0);

        // Traverse the part and disconnect it from the rest of the list
        for (int j = 0; j < partLength; j++) {
            previous = current;
            current = current.next;
        }

        // Disconnect the current part from the rest of the list
        if (previous != null) {
            previous.next = null;
        }
    }

    return parts;
}
    }
