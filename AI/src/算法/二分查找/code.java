package 算法.二分查找;

import java.util.Scanner;

public class code {
    public static int  binarySearch(int k, int[] arr){//初始版
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = arr.length - 1;
        int m = (i + j) >>> 1;//此处不建议使用(i+j)/2，因为在数组长度极大时，可能会产生i+j越界的问题，进而导致m计算错误，所以该处使用无符号右移运算符（本质上相当于除2并向下取整了）
        while(i <= j){
            if(k<arr[m]){
                j = m - 1;
            } else if (k>arr[m]) {
                i = m + 1;
            }else {
                return m;
            }
            m = (i + j)/2;
        }
        return -1;
    }

    public static int binarySearchAlternative(int k, int[] arr){//改动版
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = arr.length;//第一处
        int m = (i + j) >>> 1;
        while(i < j){//第二处
            if(k<arr[m]){
                j = m;//第三处
            } else if (k>arr[m]) {
                i = m + 1;
            }else {
                return m;
            }
            m = (i + j)/2;
        }
        return -1;
    }

    public static int binarySearchBalence(int k, int[] arr){//平衡版
        int i = 0;
        int j = arr.length;
        while(1 < j - i){
            int m = (i + j) >>> 1;
            if(k > arr[m]){
                j = m;
            }
            else {
                i = m;
            }
        }
        if(arr[i] == k){
            return i;
        }
        else {
            return -1;
        }

        //该方法通过减少循环内的比较次数，使总体平均比较次数减少，从而提高了效率
    }

    public static int BSLeft(int k, int[] arr){
        int temp = -1;
        int i = 0;
        int j = arr.length - 1;
        while(j >= i){
            int m = (i + j) >>> 1;
            if(arr[m] < k){
                i = m + 1;
            }
            else if(k < arr[m]){
                j = m - 1;
            }else {
                temp = m;
                j = m - 1;
            }
        }
        return temp;
    }

    public static int BSRight(int k, int[] arr){
        int temp = -1;
        int i = 0;
        int j = arr.length - 1;
        while(j >= i){
            int m = (i + j) >>> 1;
            if(arr[m] < k){
                i = m + 1;
            }
            else if(k < arr[m]){
                j = m - 1;
            }else {
                temp = m;
                i = m + 1;
            }
        }
        return temp;
    }

    public static int BS_max_smaller(int k, int[] arr){
        int temp = -1;
        int i = 0;
        int j = arr.length - 1;
        int m;
        while (j >= i){
            m = (i + j) >>> 1;
            if(arr[m] < k){
                i = m;
                temp = m;
            } else {
                j = m - 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,4,5,6,7,7,8,9,9,11,23,554,5464,32112};
        System.out.println(code.BS_max_smaller(13, arr));
    }
}
