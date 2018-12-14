package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/13
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

    Example:

    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists_21 {

//     Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        result = getResult(result,l1,l2);
        return result;
    }
    public static ListNode getResult(ListNode result, ListNode l1, ListNode l2){
        if (l1==null&&l2==null){
            return null;
        }
        if (l1==null){
            result = l2;
            return result;
        }
        if (l2==null){
            result = l1;
            return  result;
        }
        if (l1.val>l2.val){
            result = l2;
            l2 = l2.next;
        }else{
            result = l1;
            l1 = l1.next;
        }
        result.next = getResult(result.next,l1,l2);
        return result;
    }

    public static void main(String[] arge){

    }
}
