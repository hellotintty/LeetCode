package easy;

import java.util.List;

/**
 * @author tianqi
 * @date 2018/12/4
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = new ListNode(-1);
        ListNode result = current;
        while (head != null){
            if (head.val == val){
                current.next = head.next;
            }else {
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        return result.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
