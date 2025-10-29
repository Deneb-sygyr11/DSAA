package 数据结构.链表.例题.反转链表.code.methods;

import 数据结构.链表.例题.反转链表.code.List;
import 数据结构.链表.例题.反转链表.code.ListNode;

public class Method5 {
    /*法五与法二类似
    * 初始包含两个链表：其一为待翻转链表，其一为空链表
    * 创建 o1，n1 两个节点，分别指向两个链表的头部
    * 将 o1 移至 n1 之前， 并对 o1，n1 重定向
    * 重复以上操作直至待翻转链表为空 */

    public ListNode reverseList(ListNode node){
        List list = new List(null);
        ListNode o1 = node;
        ListNode n1 = list.head;
        while (o1 != null){
            ListNode temp = o1.next;
            o1.next = n1;
            n1 = o1;
            o1 = temp;
        }
        return n1;
    }
}
