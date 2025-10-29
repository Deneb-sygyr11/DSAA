package 数据结构.链表.例题.删除倒数节点.code.Methods;

import 数据结构.链表.例题.删除倒数节点.code.ListNode;

public class Method1 {
    public ListNode removeIndexFromEnd(int index, ListNode node){
        ListNode head = new ListNode(node);
        ListNode n1 = head;
        ListNode n2 = n1;
        int t = 0;
        while (n1 != null){
            n1 = n1.next;
            t++;
        }
        if(t > index && index > 0) {
            for (int i = 0; i < t - index - 1; i++) {
                n2 = n2.next;
            }
            if (n2.next != null) {
                n2.next = n2.next.next;
            }
        }
        return head.next;
    }
}
