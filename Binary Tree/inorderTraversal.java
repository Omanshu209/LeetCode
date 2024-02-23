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

import java.util.List;
import java.util.LinkedList;

class Solution
{
    List<Integer> inordered = new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root)
    {
        if(root == null)
            return inordered;
        
        inorderTraversal(root.left);
        inordered.add(root.val);
        inorderTraversal(root.right);

        return inordered;
    }
}
