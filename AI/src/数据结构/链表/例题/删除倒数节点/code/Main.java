package 数据结构.链表.例题.删除倒数节点.code;

import 数据结构.链表.例题.删除倒数节点.code.Methods.Method1;

public class Main {
    public static void main(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5,node6);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        System.out.println(node1);
        Method1 m = new Method1();
        System.out.println(m.removeIndexFromEnd(3, node1));
    }
}
