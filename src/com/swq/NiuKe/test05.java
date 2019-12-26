package com.swq.NiuKe;

import java.util.ArrayList;
import java.util.Arrays;

public class test05 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(10);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(11);
        t1.left = t2;
        t1.right =t3;

        t2.left = t4;
        t2.right =t5;

        t3.left = t6;
        t3.right =t7;
        System.out.println(KthNode(t1,3));
    }
   static TreeNode KthNode(TreeNode root, int k)
    {
        ArrayList<TreeNode> list =new ArrayList<TreeNode>();
        get(list,root);

        if(k ==0)return null;
        return list.get(k-1);
    }
    static void get(ArrayList<TreeNode> res , TreeNode root)
    {
        if(root.left != null)
        {
            get(res,root.left);
        }
        res.add(root);
        if(root.right != null)
        {
            get(res,root.right);
        }

    }
}
