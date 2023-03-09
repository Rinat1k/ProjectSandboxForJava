package leetcode.task206;

import leetcode.ListNode;
import leetcode.task21.MergeSortedList;

public class ReverseListTest {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7)))));
        System.out.println(ReverseList.apply(listNode1));
    }
}
