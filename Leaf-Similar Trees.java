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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<Integer>();
        List<Integer> result2 = new ArrayList<Integer>();
        if(root1!=null){
            traverseLeaf(root1,result1);
        }
        if(root2!=null){
            traverseLeaf(root2,result2);
        }
        return result1.equals(result2);
        
    }
    void traverseLeaf(TreeNode root, List<Integer> result){
        if(root!=null){
            if(root.left==null && root.right==null){
                result.add(root.val);
            }
            else{
                traverseLeaf(root.left,result);
                traverseLeaf(root.right,result);
            }
        }
    }
}