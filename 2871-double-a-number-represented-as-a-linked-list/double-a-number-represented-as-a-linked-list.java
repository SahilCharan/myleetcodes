import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        BigInteger num = BigInteger.ZERO;

        // Calculate the integer value represented by the linked list
        while (temp != null) {
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(temp.val));
            temp = temp.next;
        }

        // Double the integer value
        num = num.multiply(BigInteger.TWO);

        // Convert the doubled integer value to a string
        String nums = num.toString();

        // Initialize a dummy node to represent the head of the new linked list
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Create new nodes for each digit of the doubled integer value
        for (int i = 0; i < nums.length(); i++) {
            int digit = nums.charAt(i) - '0'; // Convert character to integer
            current.next = new ListNode(digit); // Create a new node with the digit
            current = current.next; // Move to the next node
        }

        return dummy.next; // Return the head of the new linked list
    }
}
