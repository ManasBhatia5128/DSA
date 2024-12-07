package Arrays.Medium;
import java.util.Arrays;
import java.util.HashMap;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,1,2,1,2,0,0,1,1,2,2,0,0,1,0,1,2,1};
        dnfOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort012Better(int[] arr){
        // Time complexity: O(N + N), firstly for filling HashMap then again filling the array
        int count = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int elem: arr){
            hash.put(elem, hash.getOrDefault(elem, 0) + 1);
        }
        if(hash.containsKey(0)){
            for(int i = 0; i < hash.get(0); i++){
                arr[count] = 0;
                count++;
            }
        }
        if(hash.containsKey(1)){
            for(int i = 0; i < hash.get(1); i++){
                arr[count] = 1;
                count++;
            }
        }
        if(hash.containsKey(2)){
            for(int i = 0; i < hash.get(2); i++){
                arr[count] = 2;
                count++;
            }
        }
    }

    // Best optimal solution: using DNF algo
    static void dnfOptimal(int[] arr){
        // We will take 3 pointers, the array will be having 4 parts at a time
        // 00000 111111 {unsorted} 22222
        // {0,l-1},{l,m-1},{m,h},{h+1,n-1} --> This is the intution behind the algorithm
        int l = 0;
        int m = 0;
        int h = arr.length - 1;
        while (m <= h) {
            if(arr[m] == 0){
                swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                swap(arr, m, h);
                h--;
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
