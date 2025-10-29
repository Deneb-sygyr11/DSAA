package 数据结构.栈.code.implement_by_node;

public class test {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>(10);

        //push test
        s.push(1);
        s.push(2);
        s.push(5);
        System.out.println(s);
        System.out.println("------------------------------");

        //pop test
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println("------------------------------");

        //----------------------------
        s.push(4);
        s.push(1);
        s.push(5);
        s.push(4);
        s.push(1);
        s.push(1);
        System.out.println(s);
        //----------------------------
        //peek test
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println("------------------------------");
    }
}
