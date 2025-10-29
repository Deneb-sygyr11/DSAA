package 数据结构.链表.例题.反转链表.code.methods;

import 数据结构.链表.例题.反转链表.code.ListNode;

public class Method1 {

    /**
     * 构造一个新链表，依次从旧链表里拿节点，添加至新链表头部
     */
    public ListNode reverseList(ListNode node){
        ListNode n1 = null;
        ListNode p = node;
        while (p != null){
            n1 = new ListNode(p.val,n1);
            p = p.next;
        }
        return n1;
    }
}
