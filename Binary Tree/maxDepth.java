/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution
{
    int max_depth = 0;
    private int depth(TreeNode root, int temp_depth)
    {
        if(root == null)
        {
            max_depth = Math.max(max_depth, temp_depth);
            temp_depth = 0;
            return max_depth;
        }

        depth(root.left, temp_depth + 1);
        depth(root.right, temp_depth + 1);
        
        return max_depth;
    }

    public int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        return depth(root, 0);
    }
}
