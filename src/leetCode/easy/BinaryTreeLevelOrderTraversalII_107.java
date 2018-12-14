package leetCode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tianqi
 * @date 2018/8/6
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class BinaryTreeLevelOrderTraversalII_107 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        addLevel(l,0,root);
        Collections.reverse(l);
        return l;
    }
    public void addLevel(List<List<Integer>> list, int level, TreeNode node){
        if(node==null){
            return ;
        }
        if(list.size()-1<level){
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(node.val);

        addLevel(list,level+1,node.left);
        addLevel(list,level+1,node.right);
    }
}
