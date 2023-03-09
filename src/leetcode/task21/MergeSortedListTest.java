package leetcode.task21;

import leetcode.ListNode;

public class MergeSortedListTest {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7)))));
        ListNode listNode2 = new ListNode(-1, new ListNode(0, new ListNode(4, new ListNode(6, new ListNode(8)))));
        System.out.println(MergeSortedList.apply(listNode1, listNode2));

    }
}
