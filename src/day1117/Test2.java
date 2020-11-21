package day1117;

import java.util.List;

/*将两个升序链表合并为一个新的升序链表并返回。
新链表是通过拼接给定的两个链表的所有节点组成的。*/
/*
public class Test2 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);

        mergeTwoLists();
    }

    public static ListNode mergeTwoLists(ListNode n1, ListNode n2) {
        if (n1 == null){
            return n2;
        }else if (n2 == null){
            return n1;
        }else if (n1.val < n2.val){
            n1.next = mergeTwoLists(n1.next,n2);
            return n1;
        }else {
            n2.next = mergeTwoLists(n1,n2.next);
            return n2;
        }
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}*/
