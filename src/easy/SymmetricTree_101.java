package easy;

/**
 * @author tianqi
 * @date 2018/7/31
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree_101 {
    public class TreeNode {
        int val;
        SymmetricTree_101.TreeNode left;
        SymmetricTree_101.TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymetricTree(TreeNode root) {
        TreeNode p = root;
        TreeNode q = root;
        return helper(p, q);
    }

    private boolean helper(TreeNode p, TreeNode q) {
        if (p == null || q == null){
            return p == q;
        }
        return (p.val == q.val) && helper(p.left, q.right) && helper(p.right, q.left);
    }
}
