package Sorting;

import java.util.Arrays;

// Take an element and place it in its correct position, basically there will be a sorted and a unsorted part, it will still be a scientific sort, basically the condition arises if we do <= or < in the swapping condition
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,4,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j); // use of swapped variable is not required since it will still be traversing back in any case
                }
            }
        }
    }
}
