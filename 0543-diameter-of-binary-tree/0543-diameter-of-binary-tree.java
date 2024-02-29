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
    public int calHeight(TreeNode root) {
        if(root==null){
            return 0;
        }
        return (Math.max(calHeight(root.left),calHeight(root.right)) + 1);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftH=calHeight(root.left);
        int rightH=calHeight(root.right);

        int leftDia=diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);

        return Math.max(leftH+rightH,Math.max(leftDia,rightDia));
    }
}