package Arrays.Medium;
import java.util.HashMap;

public class Sort012 {
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
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        
    }
}
