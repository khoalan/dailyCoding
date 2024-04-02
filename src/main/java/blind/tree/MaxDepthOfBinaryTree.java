package blind.tree;

public class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        int ansLeft = 1;
        int ansRight = 1;
        if (root == null) return 0;
        if (root.left == null && root.right == null ){
            return 1;
        }

        if (root.left != null){
            ansLeft = Math.max(ansLeft, ansLeft+maxDepth(root.left));

        }
        if (root.right != null){
            ansRight = Math.max(ansRight, ansRight+maxDepth(root.right));

        }
        return Math.max(ansLeft, ansRight);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2,n1,n3);
        TreeNode n7 = new TreeNode(7,n6,n9);
        TreeNode n4 = new TreeNode(4,n2,n7);
        System.out.println(maxDepth(n4));
    }
}
