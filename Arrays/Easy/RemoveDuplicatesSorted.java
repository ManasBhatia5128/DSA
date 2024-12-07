package Arrays.Easy;

import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate(nums));
    }
    static int removeDuplicate(int[] arr){
        // int[] returnArr = new int[arr.length];
        int k = 1;
        int elem = arr[0];
        // returnArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != elem){
                elem = arr[i];
                arr[k] = elem;
                k += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        return k;
    }
}
