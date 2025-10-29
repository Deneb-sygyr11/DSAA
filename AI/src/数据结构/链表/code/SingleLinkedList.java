package 数据结构.链表.code;

public class SingleLinkedList {
    //单向链表

    Node head;
    Node tail;
    int length;

    public SingleLinkedList(){
        head = new Node();
        tail = new Node();
        length = 0;
        head.linkNodeNext(tail);
    }

    //增
    public void addNode(int value){
        Node node = new Node(value);
        if(length == 0){
            head.linkNodeNext(node);
        }else {
            Node temp = head;
            for(int i = 0; i < length; i++){
                temp = temp.getNext();
            }
            temp.linkNodeNext(node);
        }
        node.linkNodeNext(tail);
        length++;
    }

    //删
    public void deleteNode(int index){
        if(index >= 0 && index < length){
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.getNext();
            }
            temp.linkNodeNext(temp.getNext().getNext());
            length--;
        }else {
            System.out.println("索引不合法！");
        }
    }

    public void deleteNodeAfter(int index){
        if(index >= 0 && index < length){
            Node temp = head;
            for(int i = 0; i <= index; i++){
                temp = temp.getNext();
            }
            temp.unlinkNodeNext();
            length = index + 1;
        }else {
            System.out.println("索引不合法！");
        }
    }//不删除当前索引的数据，但该索引之后的所有数据都被删除

    //改
    public void reValue(int index, int newValue){
        if(index >= 0 && index < length){
            Node temp = head;
            for(int i = 0; i <= index; i++){
                temp = temp.getNext();
            }
            temp.setValue(newValue);
        }else {
            System.out.println("索引不合法！");
        }
    }

    //插
    public void addNodeAt(int index, int value){
        Node node = new Node(value);
        if(index >= 0 && index < length){
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.getNext();
            }
            node.linkNodeNext(temp.getNext());
            temp.linkNodeNext(node);
            length++;
        }else {
            System.out.println("索引不合法！");
        }
    }

    //遍历
    public void traverse(int index){
        if(index >= 0 && index < length) {
            Node temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.getNext();
                System.out.print(temp.getValue() + "\t");
            }
            System.out.println();
        }else {
            System.out.println("索引不合法！");
        }
    }
}
