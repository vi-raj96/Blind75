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
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        return Math.max(leftHt,rightHt)+1;

    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(isBalanced(root.left)==false){
            return false;
        }
        if(isBalanced(root.right)==false){
            return false;
        }

        int leftHt = height(root.left);
        int rightHt = height(root.right);

        if(Math.abs(rightHt-leftHt)<=1){
            return true;
        }else{
            return false;
        }
    }
}