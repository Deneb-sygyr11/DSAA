package 数据结构.链表.例题.根据值删除节点.code.Methods;

import 数据结构.链表.例题.根据值删除节点.code.ListNode;

public class Method1 {
    public ListNode removeVal(int val, ListNode node){
        ListNode head = new ListNode(node);//人为添加一个头结点（哨兵节点）避免对于旧头结点的单独判断
        ListNode n1 = head;
        ListNode n2;
        while ((n2 = n1.next) != null){
            if(n2.val == val){
                n1.next = n2.next;
            }else {
                n1 = n2;
            }
        }
        return head.next;
    }
}
