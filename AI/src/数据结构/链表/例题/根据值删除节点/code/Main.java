package 数据结构.链表.例题.根据值删除节点.code;

import 数据结构.链表.例题.根据值删除节点.code.Methods.Method1;
import 数据结构.链表.例题.根据值删除节点.code.Methods.Method2;

public class Main {
    public static void main(String[] args) {
        ListNode node9 = new ListNode(1,null);
        ListNode node8 = new ListNode(1,node9);
        ListNode node7 = new ListNode(8,node8);
        ListNode node6 = new ListNode(7,node7);
        ListNode node5 = new ListNode(3,node6);
        ListNode node4 = new ListNode(2,node5);
        ListNode node3 = new ListNode(1,node4);
        ListNode node2 = new ListNode(1,node3);
        ListNode node1 = new ListNode(1,node2);
        System.out.println(node1);
        Method2 m = new Method2();
        System.out.println(m.removeVal(1, node1));
        System.out.println("---------------------------------------------");
        ListNode l = new ListNode();
        l = l.ListOfValue(6,7);
        System.out.println(l);
        System.out.println(m.removeVal(7, l));
    }
}
