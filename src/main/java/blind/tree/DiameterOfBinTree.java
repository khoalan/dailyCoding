package blind.tree;

public class DiameterOfBinTree {
    static int ans = -1;
    public static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    public static int height(TreeNode root) {
        if (root == null) return -1;
        int max = 0;
        int left = height(root.left)+1;
        int right = height(root.right)+1;
        max = left+right;
        ans = Math.max(ans, max);
        return Math.max(left, right);
    }

    public static void main(String[] args) {

    }
}
