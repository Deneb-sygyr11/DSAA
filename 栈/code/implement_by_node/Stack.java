package 数据结构.栈.code.implement_by_node;

import java.io.BufferedWriter;

public class Stack<E> {
    //由节点类实现栈
    int capacity;
    int size;
    Node<E> head = new Node<>(null,null);

    public Stack(int capacity){
        this.capacity = capacity;
    }

    //判断满容量
    public boolean isFull(){
        return size >= capacity;
    }

    //判断为空
    public boolean isNull(){
        return size == 0;
    }

    //压入
    public boolean push(E val) {
        if(!isFull()){
            head.next = new Node<>(val,head.next);//此处直接使用head.next，无需进行一次为空判断
            size++;
            return true;
        }
        return false;
    }

    //弹出(返回栈顶值，并删除该元素)
    public E pop(){
        if(isNull()){
           return null;
        }
        Node<E> top = head.next;
        head.next = top.next;
        size--;
        return top.val;
    }

    //peek(返回栈顶值，不删除该元素)
    public E peek(){
        if(isNull()){
            return null;
        }
        return head.next.val;
    }


    //toString
    public String toString() {
        if (isNull()) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        Node<E> cur = head;
        while (cur.next != null) {
            sb.append(cur.next.val);
            if(cur.next.next!=null){
                sb.append(' ');
            }
            cur = cur.next;
        }
        return sb.toString();
    }

}
class Node<E>{
    E val;
    Node<E> next;

    public Node(E val, Node<E> next){
        this.val = val;
        this.next = next;
    }
}


