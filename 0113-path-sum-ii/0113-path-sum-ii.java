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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, 0, path);

        return ans;
    }

    public void dfs(TreeNode root, int targetSum, int sum, List<Integer> path) {

        if (root == null) {
            return;
        }

        // Current node ko path mein add karo
        path.add(root.val);
        sum += root.val;

        // Leaf node
        if (root.left == null && root.right == null) {

            if (sum == targetSum) {
                ans.add(new ArrayList<>(path));
            }

            // Backtrack
            path.remove(path.size() - 1);
            return;
        }

        // Left subtree
        dfs(root.left, targetSum, sum, path);

        // Right subtree
        dfs(root.right, targetSum, sum, path);

        // Backtrack
        path.remove(path.size() - 1);
        
    }
}