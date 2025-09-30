public class MaxMinSegmentTree {
    static int[] tree;
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildSegmentTree(int[] arr, int i, int si, int sj){
        if(si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = si + (sj - si)/2;
        buildSegmentTree(arr, 2*i + 1, si, mid);
        buildSegmentTree(arr, 2*i + 2, mid + 1, sj);
        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(si > qj || sj < qi){
            return Integer.MIN_VALUE;
        }else if(si >= qi && sj <= qj){
            return tree[i];
        }else{
            int mid = si + (sj - si)/2;
            int left = getMaxUtil(2*i + 1, si, mid, qi, qj);
            int right = getMaxUtil(2*i + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    }
    public static int getMax(int[] arr, int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static void updatMaxUtil(int i, int si, int sj, int idx, int newVal){
        if(idx > sj || idx < si){
            return;
        }
        if(si == sj){
            tree[i] = newVal;
        }
        else if(si != sj){
            tree[i] = Math.max(tree[i], newVal);
            int mid = si + (sj - si)/2;
            updatMaxUtil(2*i + 1, si, mid, idx, newVal);
            updatMaxUtil(2*i + 2, mid + 1, sj, idx, newVal);
            
        }
    }
    public static void updateMax(int idx, int newValue, int[] arr){
        int n = arr.length;
        arr[idx] = newValue;
        updatMaxUtil(0, 0, n-1, idx, newValue);
    }
    public static void main(String[] args){
        int[] arr = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildSegmentTree(arr, 0, 0, n-1);
        System.out.println("Maximum value in given range is " + getMax(arr, 1, 5));
        updateMax(1, 20, arr);
        System.out.println("Maximum value in given range after updating is " + getMax(arr, 1, 5));
    }
}
