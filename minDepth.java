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
    int min_depth = -1;
    private int depth(TreeNode root, int temp_depth)
    {
        if(root == null)
            return min_depth;

        else if(root.left == null && root.right == null)
        {
            if(min_depth != -1)
                min_depth = Math.min(min_depth, temp_depth);
            else
                min_depth = temp_depth;
            
            temp_depth = 0;
            return min_depth;
        }

        depth(root.left, temp_depth + 1);
        depth(root.right, temp_depth + 1);
        
        return min_depth;
    }

    public int minDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        return depth(root, 1);
    }
}
