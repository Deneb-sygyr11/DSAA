package 数据结构.数组.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray {
    //该段代码目的为实现动态数组的基本功能

    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity){
        size = 0;
        capacity = initialCapacity;
        array = new int[initialCapacity];
    }

    //增
    public void add(int num){
        if(size >= capacity) {
            addSpace(4);
        }
        array[size] = num;
        size++;
    }

    //删
    public void delete(int index){
        //虽然说在删的时候同步减少数组长度能够减少内存占用，但该段代码不对其进行实现
        if(index == size - 1){
            size--;
        } else if (index < size - 1) {
            for(int i = index; i < size - 1; i++){
                array[i] = array[i+1];
            }
            size--;
        }else {
            System.out.println("索引越界！");
        }
        //这里的理念就是索引大于size-1的元素对数组无意义(所以有啥方法能让元素变回null嘛。。。)
    }

    //插
    public void addAt(int index, int num){
        if(size == capacity){
            addSpace(4);
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = num;
        size++;
    }

    //遍历
    public void traverse(){
        System.out.println(Arrays.toString(array));
    }

    //扩容
    public void addSpace(int space){
        int[] temp = new int[capacity];
        System.arraycopy(array, 0, temp, 0, array.length);
        capacity += space;
        array = new int[capacity];
        System.arraycopy(temp,0,array,0,temp.length);
    }
}
