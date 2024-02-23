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
    List<Integer> postorder = new LinkedList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root)
    {
        if(root == null)
            return postorder;
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postorder.add(root.val);

        return postorder;
    }
}
