package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/28
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

        示例 1:

    输入: 1->1->2
    输出: 1->2
    示例 2:

    输入: 1->1->2->3->3
    输出: 1->2->3

    自己一开始写了一个过了，无奈看了用时最短老哥的答案自己的实在看不下去了，借用他的来学习
 */
public class RemoveDuplicatesfromSL_83 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode headPoint = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return headPoint;
    }
}
