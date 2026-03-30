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

    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {

        res = new ArrayList<>();

        rightSide(root, 0);

        return res;
        
    }

    public void rightSide(TreeNode node, int depth){

        if(node == null){
            return;
        }

        if(res.size() == depth){

            res.add(node.val);
        }

        rightSide(node.right, depth+1);

        rightSide(node.left, depth+1);

       

    }
}
