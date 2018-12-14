package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/8/3
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 *
 * note:写的比较蠢，不过思路基本就是这样，也就不改了
 */
public class MaximumDepthofBinaryTree_104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int maxDepth(TreeNode root) {
        int length = 0;
        if (root != null){
            length++;
            int temp1 = 1;
            int temp2 = 1;
            if (root.left !=null){
                temp1 += maxDepth(root.left);
            }
            if (root.right != null){
                temp2 += maxDepth(root.right);
            }
            if (temp1>length){
                length = temp1;
            }
            if (temp2>length){
                length = temp2;
            }
            return length;
        }return length;
    }
}
