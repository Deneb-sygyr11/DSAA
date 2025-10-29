package 数据结构.链表.例题.反转链表.code;

public class List {

    public ListNode head;

    public List(ListNode head) {
        this.head = head;
    }

    public void addFirst(ListNode firstNode) {//这里的firstNode是从后往前加
        firstNode.next = head;
        head = firstNode;
    }

    public ListNode removeFirst() {//这里又改从前往后了。。。
        ListNode first = head;
        if (first != null) {
            head = first.next;
        }
        return first;
    }

}
