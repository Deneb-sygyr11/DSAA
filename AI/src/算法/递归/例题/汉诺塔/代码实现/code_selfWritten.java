package 算法.递归.例题.汉诺塔.代码实现;

import java.util.Arrays;

public class code_selfWritten {
    /**
     *  写的是一坨什么狗屎
     *  我tm自己都看不懂！！！
     */
    private int n;
    private int[] init;
    private int[] goal;

    public code_selfWritten(int n){
        this.n = n;
        init = new int[n];
        goal = new int[n];
        Arrays.fill(goal,0);
        for(int i = 0; i < n; i++){
            init[i] = n - i;
        }
    }

    public void hanoi(){
        hanoi(n,-1,goal);
        System.out.println(Arrays.toString(goal));
    }

    /**
     *  能看懂这一段的，家里得请哈基仙了
     */
    private void hanoi(int n, int m, int[]goal){
        if(n == 1){
            goal[m+1] = 1;
            return;
        }
        int[] tempInit = new int[n];
        for(int i = 0; i < n; i++){
            tempInit[i] = n - i;
        }
        int[] temp = new int[n - 1];
        hanoi(n-1,-1,temp);
        goal[m + 1] = tempInit[0];
        System.out.println("----------------------------");
        System.out.println("temp:"+Arrays.toString(temp));
        System.out.println("goal:"+Arrays.toString(goal));
        hanoi(n-1,m + 1,goal);
        System.out.println("----------------------------");
        System.out.println("temp:"+Arrays.toString(temp));
        System.out.println("goal:"+Arrays.toString(goal));
    }
}