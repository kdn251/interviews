// Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.

// You may assume the integer do not contain any leading zero, except the number 0 itself.

// The digits are stored such that the most significant digit is at the head of the list.

// Example:
// Input:
// 1->2->3

// Output:
// 1->2->4

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        if(plusOneRecursive(head) == 0) {
            return head;
        } else {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            
            return newHead;
        }
    }
    
    private int plusOneRecursive(ListNode head) {
        if(head == null) {
            return 1;
        }
        
        int carry = plusOneRecursive(head.next);
        
        if(carry == 0) {
            return 0;
        }
        
        int value = head.val + 1;
        head.val = value % 10;

        return value/10;
    }
}
