package 数据结构.栈.code.implement_by_array;

public class Stack<E> {
    //由数组实现栈

    public int capacity;
    public int size;
    public Object[] arr;

    public Stack(int capacity){
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    //isNull
    public boolean isNull(){
        return size == 0;
    }

    //isFull
    public boolean isFull(){
        return size == capacity;
    }

    //push
    public boolean push(E val){
        if(isFull()){
            return false;
        }
        arr[size] = val;
        size++;
        return true;
    }

    //pop
    public Object pop(){
        if(isNull()){
            return null;
        }
        Object top = arr[size - 1];
        arr[size - 1] = null;
        size--;
        return top;
    }

    //peek
    public Object peek(){
        if(isNull()){
            return null;
        }
        return arr[size];
    }


    //toString
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (isNull()) {
            return null;
        }
        for (int i = size - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if(i!=0){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}

