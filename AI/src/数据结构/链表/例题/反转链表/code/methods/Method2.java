package 数据结构.链表.例题.反转链表.code.methods;

import 数据结构.链表.例题.反转链表.code.List;
import 数据结构.链表.例题.反转链表.code.ListNode;

public class Method2 {
    /**
     * 法二与法一类似，将旧链表头部的节点移除，添加至新链表头部
     */
    public ListNode reverseList(ListNode head){
        List list1 = new List(head);
        List list2 = new List(null);
        while (list1.head != null){
            list2.addFirst(list1.removeFirst());
        }
        return list2.head;
    }
}

