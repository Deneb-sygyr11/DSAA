package 数据结构.链表.例题.反转链表.code;

import 数据结构.链表.例题.反转链表.code.methods.*;

public class Main {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        System.out.println(node1);
        Method5 m = new Method5();
        System.out.println(m.reverseList(node1));
    }
}
