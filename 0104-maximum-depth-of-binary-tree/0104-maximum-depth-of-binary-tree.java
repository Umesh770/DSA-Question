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
    public int maxDepth(TreeNode root) {
    //     int count=0;
    //     dfs(root);
    //     return count;
    // }
    // int dfs(TreeNode node){
    //     if(node==null){
    //         return 0;
    //     }
    //     int count=0;
    //     int left=dfs(node.left);
    //     int right=dfs(node.right);

    //     count= 1+Math.max(left,right);
    // }
    if(root==null){
        return 0;
    }
    int left=maxDepth(root.left);
    int right=maxDepth(root.right);

    return 1+ Math.max(left,right);
    }
}