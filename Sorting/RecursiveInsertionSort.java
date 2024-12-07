package Sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 4, 2, 1};
        recursiveSort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void recursiveSort(int[] arr, int ptr){
        if(ptr == arr.length - 1){
            return;
        }
        for(int i = ptr+1; i >= 1 ; i--){
            if(arr[i] < arr[i-1]){
                swap(arr, i, i-1);
            }
        }
        recursiveSort(arr, ptr+1);
    }
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
