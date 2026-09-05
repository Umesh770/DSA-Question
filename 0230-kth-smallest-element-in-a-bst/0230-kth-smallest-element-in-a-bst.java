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
     int count=0;
        int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
       
        if(k==0){
            return 0;
        }
        inorder(root,k);
        return ans;
    }
    void inorder(TreeNode node,int k){

        if(node==null){
            return;
        }
        inorder(node.left,k);
        if(count>=k) return;
        count++;
        if(count==k){
            ans=node.val;
            return;
        }
        inorder(node.right,k);
    }
}