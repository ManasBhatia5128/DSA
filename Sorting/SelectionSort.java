package Sorting;
import java.util.Arrays;
// Sort by placing the minimum element in its correct postition, it is not a stable sorting algo since you swap elements say {2,3,4,2,1}, when you swap (2,1) the relative ordr of elments changes
public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
}