package leetcode.task206;

import leetcode.ListNode;

import java.util.ArrayList;

public class ReverseList {


    public static ListNode apply(ListNode head) {
        ListNode i1 = head;
        ListNode i2 = i1.next;
        System.out.println(i1.next == i2);
        return head;
    }

    @Deprecated
    public static ListNode applyOld(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode newList = new ListNode(0);
        ListNode iterator = newList;

        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            iterator.next = new ListNode(arrayList.get(i));
            iterator = iterator.next;
        }

        return newList.next;
    }

}
