package 数据结构.链表.例题.反转链表.code.methods;

import 数据结构.链表.例题.反转链表.code.ListNode;

public class Method4 {
    /*该方法需创建 o1,n1 两个节点
    * 初始时 o1,n1 均为原链表头节点
    * o1始终保持不变，将 o1的下一个节点移至最前端，并令 n1 为该节点
    * 如此循环直至 o1.next 为 null */

    public ListNode reverseList(ListNode listNode){
        if (listNode == null){
            return listNode;
        }
        ListNode o1 = listNode;
        ListNode n1 = listNode;
        while (o1.next != null){
            ListNode temp = o1.next;
            o1.next = o1.next.next;
            temp.next = n1;
            n1 = temp;
        }
        return n1;
    }
}
