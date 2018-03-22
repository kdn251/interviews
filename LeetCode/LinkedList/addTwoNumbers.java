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
        ListNode current1 = l1;
        ListNode current2 = l2;
        
        ListNode head = new ListNode(0);
        ListNode currentHead = head;
        
        int sum = 0;
        
        while(current1 != null || current2 != null) {
            sum /= 10;
            
            if(current1 != null) {
                sum += current1.val;
                current1 = current1.next;
            }
            
            if(current2 != null) {
                sum += current2.val;
                current2 = current2.next;
            }
            
            currentHead.next = new ListNode(sum % 10);
            currentHead = currentHead.next;
        }
        
        
        if(sum / 10 == 1) {
            currentHead.next = new ListNode(1);
        }
        
        return head.next;
    }
}
