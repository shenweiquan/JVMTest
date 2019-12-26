package com.swq.NiuKe;

import java.util.HashSet;
import java.util.Set;

public class test01 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;
        System.out.println(EntryNodeOfLoop2(node1));

    }
    public static ListNode EntryNodeOfLoop2(ListNode pHead) {
        //1先判断是否有环
        ListNode low = pHead;
        ListNode fast = pHead;
        boolean flag = false;
        while (fast != null && fast.next.next != null)
        {
            fast = fast.next.next;
            low = low.next;
            if(fast == low)
            {
                flag = true;
                break;
            }
        }
        if(fast==null||fast.next==null)
            return null;
        if(!flag)return null;
        low = pHead;
        while(low != fast)
        {
            low = low.next;
            fast = fast.next;
        }
        return low;

    }

    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null )return pHead;
        Set<ListNode> set = new HashSet<>();
        while(pHead != null)
        {
            if(set.contains(pHead))
            {
                return  pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "val="+this.val;
    }
}
