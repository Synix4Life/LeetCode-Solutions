/*
* Runtime: 0ms -> Beats 100% of users with Java
* Memory: 41.99MB -> Beats 9.09% of user with Java
*/

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
    public List<Integer> postorderTraversal(TreeNode root) {
        var lst = new LinkedList<Integer>();
        traverse(root, lst);
        return lst;
    }
    public void traverse(TreeNode node, List<Integer> lst){
        if(node == null){
            return;
        }
        traverse(node.left, lst);
        traverse(node.right, lst);
        lst.add(node.val);
    }
}