package 数据结构.链表.例题.根据值删除节点.code;

public class List {

    public ListNode head;

    public List(ListNode head) {
        this.head = head;
    }

    public ListNode removeFirst() {//这里又改从前往后了。。。
        ListNode first = head;
        if (first != null) {
            head = first.next;
        }
        return first;
    }

}
