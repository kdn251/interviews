// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Dummy node to simplify the result list creation
        ListNode current = dummyHead;  // Pointer for traversing the result list
        int carry = 0;  // Variable to track the carry
        
        // Traverse both lists until both are null and there's no carry left
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with the carry from the previous addition
            
            // Add value from the first list if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            // Add value from the second list if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Compute the new carry (either 1 or 0) for the next iteration
            carry = sum / 10;
            
            // Create a new node with the digit and attach it to the result list
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        // Return the result list, skipping the dummy head
        return dummyHead.next;
    }
}

