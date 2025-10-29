package 数据结构.数组.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray darr = new DynamicArray(8);
        darr.add(1);
        darr.add(1);
        darr.add(4);
        darr.add(5);
        darr.add(1);
        darr.add(4);
        darr.add(1);
        darr.add(9);
        darr.add(1);
        darr.add(9);
        darr.add(8);
        darr.add(1);
        darr.add(0);
        darr.addAt(6,114);
        darr.addAt(14,514);
        darr.addAt(15,1919);
        darr.addAt(16,810);
        darr.delete(6);
        darr.delete(15);
        darr.delete(15);
        darr.traverse();
        System.out.println();
    }
}
