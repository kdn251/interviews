public class NthToLast {
  public static LinkedList nthToLast(LinkedListNode head, int n) {
    if (head == null || n <= 0) return null;

    LinkedListNode p1 = head;
    LinkedListNode p2 = head;

    // Move p2 ahead by n nodes
    for (int i = 0; i < n; i++) {
      if (p2 == null) return null; // n is larger than the list length
      p2 = p2.next;
    }

    // Move both pointers until p2 hits the end
    while (p2 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    // p1 now points to the Nth to last node
    return p1;
  }
}
