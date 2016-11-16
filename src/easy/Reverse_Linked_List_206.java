package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import utils.ListNode;

/**
 * Reverse a singly linked list.
 */
public class Reverse_Linked_List_206 {
    public ListNode reverseListIter(ListNode head) {
    /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public ListNode reverseList(ListNode head) {
    /* recursive solution */
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}
