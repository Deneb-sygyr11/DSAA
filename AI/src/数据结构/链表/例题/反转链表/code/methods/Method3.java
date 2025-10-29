package 数据结构.链表.例题.反转链表.code.methods;

import 数据结构.链表.例题.反转链表.code.ListNode;

public class Method3 {
    //递归
    public ListNode reverseList(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        ListNode last = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return last;
    }

    //绕晕了>_<
}
