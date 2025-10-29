package 数据结构.链表.例题.根据值删除节点.code;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(ListNode next){
        this.next = next;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public String toString(){
        return toString(this);
    }

    private String toString(ListNode node){
        StringBuffer stringBuffer = new StringBuffer("[");
        while (node != null){
            stringBuffer.append(node.val);
            node = node.next;
            if(node != null){
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
        return new String(stringBuffer.toString());
    }

    public ListNode ListOfValue(int times, int val){
        ListNode head = new ListNode(null);
        ListNode n = head;
        while (times > 0){
            ListNode node = new ListNode(val);
            head.next = node;
            head = head.next;
            times--;
        }
        return n.next;
    }
}
