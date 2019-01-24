package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqi
 * @date 2019/1/24
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class InvertedList_206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;
        while (p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        head = p1;
        return head;
    }
}

