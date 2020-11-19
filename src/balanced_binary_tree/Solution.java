package balanced_binary_tree;

import sun.reflect.generics.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static boolean isBalanced(TreeNode root) {
        if (root==null || (root.left==null && root.right==null)){
            return true;
        }
        boolean leftBool = isBalanced(root.left);
        boolean rightBool = isBalanced(root.right);
        return (leftBool && rightBool && (Math.abs(height(root.left)-height(root.right))<=1));
    }

    public static int height(TreeNode node){
        if (node ==null){
            return 0;
        }
        if (node.left==null && node.right==null){
            return 1;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.left = null;
        n1.right = n2;
        n2.left = null;
        n2.right = n3;
        System.out.println(isBalanced(n1));;
    }
}
