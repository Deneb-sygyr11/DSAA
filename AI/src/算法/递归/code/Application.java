package 算法.递归.code;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    long time1 = 0;
    int time2 = 0;

    public void ReversePrint(String s){
        reversePrint(s,0);
    }

    public int BinarySearch(int[] arr, int n){
        return binarySearch(arr, 0, arr.length, n);
    }

    public void Bubble(int[] arr){
        bubble(arr, arr.length);
    }

    public void Bubble2(int[] arr){
        bubble2(arr, arr.length - 1);
    }

    public void Insertion(int[] arr){
        insertion(arr, 1);
    }

    public long Fibonacci1(int n){
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(0L);
        arrayList.add(1L);
        return Fibonacci(n,arrayList);
    }

    //factorial ———— 阶乘
    public long factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num - 1);
    }

    //reversePrint ———— 反向打印字符串
    private void reversePrint(String s, int n){
        if(n == s.length()){
            return;
        }
        reversePrint(s, n + 1);
        System.out.print(s.charAt(n));
    }//用这种的优点是使用方法时可以固定将n赋值为0

    //binarySearch ———— 二分查找
    //此处为递增数组
    private int binarySearch(int[] arr, int i, int j, int n) {
        if (j - i <= 1 && arr[i] != n) {
            return -1;
        }
        int m = (i + j) >>> 1;
        if (arr[m] > n) {
            return binarySearch(arr, i, m, n);
        } else if(arr[m] < n){
            return binarySearch(arr, m, j, n);
        }else {
            return m;
        }
    }

    //冒泡排序
    private void bubble(int[] arr, int n){
        if(n == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubble(arr, n - 1);
    }

    //冒泡排序2
    private void bubble2(int[] arr, int n){
        if(n == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int x = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                x = i;
            }
        }
        bubble2(arr, x);
    }//该排序方法能够减少一些不必要的处理的次数，从而提高效率

    //插入排序
    private void insertion(int[] arr, int n){
        if(n == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[n];
        int i = n - 1;
        while(i >= 0 && arr[i] > temp){
            arr[i + 1] = arr[i];
            i--;
        }
        if(i + 1 != n){
            arr[i + 1] = temp;
        }
        insertion(arr, n + 1);
    }

    //斐波那契
    public long fibonacci(int n){
        if(n == 0){
            time1++;
            return 0;
        }
        if(n == 1){
            time1++;
            return 1;
        }
        time1++;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }//优化前：O(n) = 1.618^n
    //斐波那契优化版
    private long Fibonacci(int n, ArrayList<Long> arrayList){
        if(n < arrayList.size()){
            time2++;
            return arrayList.get(n);
        }
        long temp = Fibonacci(n - 1, arrayList) + Fibonacci(n - 2, arrayList);
        arrayList.add(temp);
        time2++;
        return temp;
    }//优化后：O(n) = n
}
