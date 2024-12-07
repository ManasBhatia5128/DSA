package Sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 4, 2, 1};
        recursiveSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(args));
    }
    static void recursiveSort(int[] arr, int ptr){
        if(ptr == 0){
            return;
        }
        boolean swapped = false;
        for(int i = 0; i <= ptr-1; i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
                swapped = true;
            }
        }
        if(!swapped){
            return;
        }
        recursiveSort(arr, ptr-1);
    }
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
