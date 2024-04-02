package blind.tree;

//https://leetcode.com/problems/invert-binary-tree/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return ":" + val +","+ left +","+ right;
    }
}
public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left != null){
            root.left = invertTree(root.left);
        }
        if (root.right != null){
            root.right = invertTree(root.right);
        }
        return helper(root);
    }
    public static TreeNode helper(TreeNode node){
        TreeNode temp;
        temp = node.left;
        node.left = node.right;
        node.right = temp;
        return node;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2,n1,n3);
        TreeNode n7 = new TreeNode(7,n6,n9);
        TreeNode n4 = new TreeNode(4,n2,n7);
        System.out.println(invertTree(n4));
    }
}
