package com.swq.NiuKe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test04 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        Queue<TreeNode> tmp  = new LinkedList<>();
        tmp.add(root);
        while(!tmp.isEmpty())
        {
            TreeNode r = tmp.poll();
            if(r.left  != null)
            {
                tmp.add(r.left);
            }
            if(r.right != null)
            {
                tmp.add(r.right);
            }
        }
    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return pHead;
        if(pHead.val == pHead.next.val)
        {
            ListNode node = pHead.next;
            while(node != null && node.val == pHead.val)
            {
                node = node.next;
            }
            return deleteDuplication(node);
        }
        else
        {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;

        }
    }
    void Print(TreeNode root) {
        if(root != null)
        {
            if(root.left !=null)
            {
                Print(root.left);
            }
            if(root.right !=null)
            {
                Print(root.right);
            }
        }
        else
        {
            return ;
        }
    }

}
