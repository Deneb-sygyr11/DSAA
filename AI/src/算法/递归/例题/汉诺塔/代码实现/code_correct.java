package 算法.递归.例题.汉诺塔.代码实现;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class code_correct {
    /**
     * 用链表进行数据的传递和存储
     */
    LinkedList<Integer> a = new LinkedList<>();
    LinkedList<Integer> b = new LinkedList<>();
    LinkedList<Integer> c = new LinkedList<>();


    public code_correct(int n){
        for (int i = n; i > 0 ; i--) {
            a.addLast(i);
        }
    }

    public void move(){
        move(a.size(),a,b,c);
        print();
    }

    public void print(){
        System.out.println("----------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public void write(){
        String filePath = "C:\\Users\\sygyr\\Desktop\\1.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath,true))){
            writer.println("-------------------------------------------------");
            writer.println(a.toString());
            writer.println(b.toString());
            writer.println(c.toString());
        }
        catch (IOException e){
            System.out.println("写入发生错误");
        }
    }//嘻嘻

    /**
     *
     * @param n 当前要移动的圆盘个数
     * @param a 起始点
     * @param b 中转点
     * @param c 目标点
     */
    private void move(int n, LinkedList<Integer> a,
                     LinkedList<Integer> b,
                     LinkedList<Integer> c){
        if(n == 0){
            return;
        }
        move(n-1,a,c,b);
        c.addLast(a.removeLast());
        /*print();*/
        write();
        move(n-1,b,a,c);
    }
}
