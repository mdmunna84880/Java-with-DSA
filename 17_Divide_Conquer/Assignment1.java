public class Assignment1 {
    public static void printArray(String str[]){
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i]+" ");
        }
    }
    public static void sort(String str[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        sort(str, si, mid);
        sort(str, mid+1, ei);
        mergeSort(str, si, ei, mid);
    }
    public static void mergeSort(String str[], int si, int ei, int mid){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if(str[i].compareTo(str[j]) < 0){
                temp[k] = str[i];
                i++;
            }else{
                temp[k] = str[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = str[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = str[j];
            j++;
            k++;
        }
        for(k = 0, i = si; k < temp.length; k++){
            str[i] = temp[k];
            i++;
        }
    }
    public static void main(String[] args) {
        String str[] = {"sun", "earth", "mars", "mercury"};
        sort(str, 0, str.length-1);
        printArray(str);
    }
}