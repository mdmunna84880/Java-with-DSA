public class ConstructSegmentTree{
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static int construct(int[] arr, int i, int start, int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        tree[i] = construct(arr, 2*i+1, start, mid) + construct(arr, 2*i+2, mid+1, end);
        return tree[i];
    }

    public static int getSumUtil(int i, int qi, int qj, int si, int sj){
        if(qi >= sj || qj <= si){
            return 0;
        }else if(si >= qi && sj <= qj){
            return tree[i];
        }else{
            int mid = (si + sj)/2;
            int left = getSumUtil(2*i+1, qi, qj, si, mid);
            int right = getSumUtil(2*i+2, qi, qj, mid+1, sj);
            return left + right;
        }
    }
    public static int getSum(int[] arr, int start, int end){
        return getSumUtil(0, start, end, 0, arr.length - 1);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff){
        if(idx < si || idx > sj){
            return;
        }
        tree[i] += diff;
        if(si!= sj){
            int mid = (si + sj)/2;
            updateUtil(2*i + 1, si, mid, idx, diff);
            updateUtil(2*i + 2, mid + 1, sj, idx, diff);
        }
    }
    public static void update(int[] arr, int idx, int newVal){
        int diff = newVal -arr[idx];
        arr[idx] += diff;
        updateUtil(0, 0, arr.length-1, idx, diff);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        construct(arr, 0, 0, n - 1);
        System.out.println(getSum(arr, 2, 5));
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));

    }
}