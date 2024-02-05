/*
* Runtime: 60ms -> Beats 6.22% of users with Java
* Memory: 43.90MB -> Beats 48.26% of user with Java
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
    public boolean isValidBST(TreeNode root) {
        var lst = new LinkedList<Integer>();
        traverse(root, lst);
        for(int i=0; i<lst.size()-1; i++){
            if(lst.get(i)>=lst.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public void traverse(TreeNode node, List<Integer> lst){
        if(node == null){
            return;
        }
        traverse(node.left, lst);
        lst.add(node.val);
        traverse(node.right, lst);
    }
}
