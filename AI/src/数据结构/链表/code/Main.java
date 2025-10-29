package 数据结构.链表.code;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addNode(1);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNode(2);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNode(3);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNode(4);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNode(5);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNode(6);
        linkedList.traverse(linkedList.length - 1);
        linkedList.deleteNode(-1);
        linkedList.traverse(linkedList.length - 1);
        linkedList.deleteNode(1);
        linkedList.traverse(linkedList.length - 1);
        linkedList.deleteNode(3);
        linkedList.traverse(linkedList.length - 1);
        linkedList.reValue(0,0);
        linkedList.traverse(linkedList.length - 1);
        linkedList.reValue(1,1);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNodeAt(2,2);
        linkedList.traverse(linkedList.length - 1);
        linkedList.addNodeAt(3,3);
        linkedList.traverse(linkedList.length - 1);
        linkedList.deleteNodeAfter(1);
        linkedList.traverse(linkedList.length - 1);
        System.out.println();
    }
}
