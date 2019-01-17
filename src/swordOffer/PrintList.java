package swordOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author tianqi
 * @date 2019/1/17
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class PrintList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> temple = new Stack<>();
        while (listNode != null){
            temple.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (temple.size()>0){
            result.add(temple.pop());
        }
        return result;
    }
    public static void main(String[] arge){

    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
