package 算法.归并排序.code;

public class MergeSort {
    static int count = 0;

    public static void Sore_All(int[] a) {
        Sore_Part(a, 0, a.length - 1);
    }

    //include a[l]
    public static void Sore_After(int[] a, int l) {
        Sore_Part(a, l, a.length - 1);
    }

    //include a[r]
    public static void Sore_Before(int[] a, int r) {
        Sore_Part(a, 0, r);
    }

    public static void Sore_Part(int[] a, int l, int r) {
        int[] temp = new int[a.length];
        System.arraycopy(a, l, temp, l, r - l + 1);
        MSore(a, l, r, temp);
    }

    public static void Sore_Le_All(int[] a) {
        Sore_Le_Part(a, 0, a.length - 1);
    }

    //include a[l]
    public static void Sore_Le_After(int[] a, int l) {
        Sore_Le_Part(a, l, a.length - 1);
    }

    //include a[r]
    public static void Sore_Le_Before(int[] a, int r) {
        Sore_Le_Part(a, 0, r);
    }

    public static void Sore_Le_Part(int[] a, int l, int r) {
        int[] temp = new int[a.length];
        System.arraycopy(a, l, temp, l, r - l + 1);
        MSore_Le(a, l, r, temp);
    }

    private static void MSore(int[] a1, int l, int r, int[] b) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) >>> 1;
        MSore(a1, l, mid, b);
        MSore(a1, mid + 1, r, b);
        Merge(a1, l, r, mid, b);
    }

    static void Merge(int[] a, int l, int r, int mid, int[] b) {
        int k = l;
        int h1 = l;
        int h2 = mid + 1;
        while (h1 <= mid && h2 <= r) {
            if (b[h1] <= b[h2]) {
                a[k] = b[h1];
                k++;
                h1++;
            } else {
                a[k] = b[h2];
                k++;
                h2++;
                count += mid - h1 + 1;
            }
        }
        while (h1 <= mid) {
            a[k] = b[h1];
            k++;
            h1++;
        }
        while (h2 <= r) {
            a[k] = b[h2];
            k++;
            h2++;
        }

        System.arraycopy(a, l, b, l, r - l + 1);
    }

    private static void MSore_Le(int[] a1, int l, int r, int[] b) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) >>> 1;
        MSore_Le(a1, l, mid, b);
        MSore_Le(a1, mid + 1, r, b);
        Merge_Le(a1, l, r, mid, b);
    }

    static void Merge_Le(int[] a, int l, int r, int mid, int[] b) {
        int k = l;
        int h1 = l;
        int h2 = mid + 1;
        while (h1 <= mid && h2 <= r) {
            if (!Lexicographical.IntCompare(b[h1], b[h2])) {
                a[k] = b[h1];
                k++;
                h1++;
            } else {
                a[k] = b[h2];
                k++;
                h2++;
                count += mid - h1 + 1;
            }
        }
        while (h1 <= mid) {
            a[k] = b[h1];
            k++;
            h1++;
        }
        while (h2 <= r) {
            a[k] = b[h2];
            k++;
            h2++;
        }

        System.arraycopy(a, l, b, l, r - l + 1);
    }
}


//字典序
class Lexicographical{
    /**
     * @param a int
     * @param b int
     * @return true -> (a > b), false -> (a <= b) (in Lexicographical order)
     */
    static boolean IntCompare(int a, int b){
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        int h1 = 0;
        int h2 = 0;
        while (h1<A.length()&&h2<B.length()){
            if(A.charAt(h1) < B.charAt(h2)){
                return false;
            } else if (A.charAt(h1) > B.charAt(h2)) {
                return true;
            }else {
                h1++;
                h2++;
            }
        }
        return A.length()>B.length();
    }
}

