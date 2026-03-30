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

class Solution {

    public int goodNodes(TreeNode root) {


        return good(root, root.val);

        
    }

    public int good(TreeNode node, int max){
        if(node == null){
            return 0;
        }

        int res = (node.val >= max) ? 1 : 0;

        max = Math.max(max, node.val);

        res += good(node.left, max);

        res += good(node.right, max);

        return res;



       
    }
}
