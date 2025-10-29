package 算法.递归.code;

public class Main {
    public static void main(String[] args) {
        Application a = new Application();
        System.out.println(a.factorial(5));
        a.ReversePrint("sygyr11");
        System.out.println();
        int[] arr = new int[]{6,1,31,2,132,3,4,7,5,12};
        a.Bubble(arr);
        System.out.println(a.BinarySearch(arr,132));
        int[] arr1 = new int[]{59, 25, 25, 65, 91, 114, 6, 9, 345, 95};
        a.Bubble2(arr1);
        System.out.println(a.BinarySearch(arr1,344));
        int[] arr2 = new int[]{65, 45, 1533, 654, 2314, 235, 5, 4, 1, 98};
        a.Insertion(arr2);
        System.out.println(a.BinarySearch(arr2,1));
        System.out.println("-------------------------------------------");
        System.out.println(a.fibonacci(30));
        System.out.printf("优化前计算次数：%d\n",a.time1);
        System.out.println(a.Fibonacci1(30));
        System.out.printf("优化后计算次数：%d\n",a.time2);
        System.out.println("-------------------------------------------");
    }
}
