package com.swq.NiuKe;

public class test03 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(4);
        node1.left  = node2;
        node1.right = node3;
        node2.left =node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        get(node1);
    }
//    boolean isSymmetrical(TreeNode pRoot)
//    {
//        if(pRoot != null)
//        {
//
//        }
//    }
    public static TreeNode get( TreeNode pRoot)
    {

        if(pRoot != null)
        {

            TreeNode left = get(pRoot.left);
            System.out.println(pRoot.val);
            TreeNode right = get(pRoot.right);
            System.out.println(left == right);
            return pRoot;
        }
        return null;

    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    @Override
    public String toString() {
        return "val = " + this.val;
    }

    public TreeNode(int val) {
        this.val = val;
    }
    }
