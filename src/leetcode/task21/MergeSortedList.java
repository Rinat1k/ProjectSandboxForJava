package leetcode.task21;

import leetcode.ListNode;

/**
 * ref to task: <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 * <p>
 * level: easy
 */

public class MergeSortedList {

    /**
     * l1  1 -> i 2 -> 3 -> 6 -> 7 -> null
     * il2 -1 -> 0 -> 4 -> 6 -> 8 -> null
     */
    public static ListNode apply(ListNode list1, ListNode list2) {
        ListNode i1 = new ListNode(0);
        ListNode i2 = i1;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                i2.next = list1;
                list1 = list1.next;
            } else {
                i2.next = list2;
                list2 = list2.next;
            }
            i2 = i2.next;
        }

        if (list1 == null) i2.next = list2;
        else i2.next = list1;

        return i1.next;
    }

}
