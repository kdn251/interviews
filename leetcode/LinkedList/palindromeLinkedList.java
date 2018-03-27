/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if(fast != null) {
            slow = slow.next;
        }
        
        while(slow != null) {
            if(stack.pop() != slow.val) {
                return false;
            }

            slow = slow.next;
        }
        
        return true;
    }
}
