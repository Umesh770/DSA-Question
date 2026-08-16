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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>(); 
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int lsize=q.size();
            List<Integer> level=new ArrayList<>();
            while(lsize-->0){
                TreeNode curr=q.poll();
                level.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                 if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}