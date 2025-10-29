package 数据结构.链表.例题.根据值删除节点.code.Methods;

import 数据结构.链表.例题.根据值删除节点.code.ListNode;

public class Method2 {
    ListNode head = new ListNode();

    public Method2(){}

    //利用递归解
    public ListNode removeVal(int val, ListNode node){
        if(node == null){
            return null;
        }
        if(node.val == val){
            return removeVal(val,node.next);
        }else {
            node.next = removeVal(val,node.next);
            return node;
        }

    }
}
