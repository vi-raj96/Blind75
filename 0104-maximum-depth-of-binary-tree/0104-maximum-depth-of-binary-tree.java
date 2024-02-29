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
    public int calHeigth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return (Math.max(calHeigth(root.left),calHeigth(root.right))+1);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHt=calHeigth(root.left);
        int rightHt=calHeigth(root.right);

        return (Math.max(leftHt,rightHt)+1);
    }
}