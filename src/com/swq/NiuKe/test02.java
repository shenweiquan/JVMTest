package com.swq.NiuKe;

import javax.swing.tree.TreeNode;

public class test02 {

    public static void main(String[] args) {
//        TreeLinkNode node1 = new TreeLinkNode(8);
//        TreeLinkNode node2 = new TreeLinkNode(6);
//        TreeLinkNode node3 = new TreeLinkNode(5);
//        TreeLinkNode node4 = new TreeLinkNode(7);
//        TreeLinkNode node5 = new TreeLinkNode(10);
//        TreeLinkNode node6 = new TreeLinkNode(9);
//        TreeLinkNode node7 = new TreeLinkNode(11);
//        node1.left  = node2;
//        node1.right = node5;
//        node2.next = node1;
//        node5.next = node1;
//
//        node2.left = node3;
//        node2.right = node4;
//        node3.next = node2;
//        node4.next  = node2;
//
//        node5.left = node6;
//        node5.right = node7;
//        node6.next = node5;
//        node7.next = node5;
//
//        System.out.println(GetNext(node7));


    }

    public static  TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right != null) // 存在右子树
        {
            //寻找右子树最左边节点
            TreeLinkNode cur = pNode.right;
            while(cur.left != null)
                cur = cur.left;
            return cur;
        }
        else if(pNode.right == null && pNode.next.left == pNode)//非叶子节点
        {
            return pNode.next;
        }
        else
        {
            if(pNode.right == null && pNode.left == null) //叶子节点
            {
                TreeLinkNode cur = pNode;
                boolean flag = false;
                while(cur != null)
                {
                    if(cur.next == null)
                    {
                        flag = true;
                        break;
                    }

                    if(cur.next.right == cur)
                    {
                        cur =cur.next;
                    }
                    else
                    {
                        break;
                    }


                }
                if( flag)
                {
                    return null;
                }
                else
                {
                    return cur.next;
                }
            }
            return null;
        }


    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "val = "+ this.val ;
    }
}