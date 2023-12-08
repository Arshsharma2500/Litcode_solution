
class Solution {
    public String tree2str(TreeNode root) {
       if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        preorderTraversal(root, sb);
        return sb.toString();
    }

    private void preorderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }

        
        sb.append(node.val);

        
        if (node.left != null || (node.left == null && node.right != null)) {
            sb.append("(");
            preorderTraversal(node.left, sb);
            sb.append(")");
        }

       
        if (node.right != null) {
            sb.append("(");
            preorderTraversal(node.right, sb);
            sb.append(")");
        }
    } 
    }
