package 数据结构.链表.code;

public class Node {
    private int value;
    private Node before;
    private Node next;

    public Node(){}

    public Node(int value){
        this.value = value;
    }

    public void linkNodeBefore(Node before){
        this.before = before;
    }

    public void linkNodeNext(Node next){
        this.next = next;
    }

    public void unlinkNodeNext(){
        next = null;
    }

    public void unlinkNodeBefore(){
        before = null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getBefore() {
        return before;
    }

    public Node getNext() {
        return next;
    }
}
