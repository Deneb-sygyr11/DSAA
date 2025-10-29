package 数据结构.链表.例题.反转链表.code;

public class ListNode {
    public int val;
    public ListNode next;

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
}
