package Arrays.Medium;

import java.util.Arrays;

// Understand pass by value and reference again
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        nextPermutationOptimal(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void nextPermutationBrute(int[] arr){
        // We generate all possible permutations and find the required
        int[] temp = arr;
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                for (int j2 = 0; j2 < temp.length; j2++) {
                    if(i != j && j != j2 && i != j2){
                    System.out.println(Arrays.toString(new int[]{arr[i],arr[j],arr[j2]}));
                    }
                }
            }
        }// try to do using for loops only, assignment
        // return temp[0];
    }

    static void nextPermutationOptimal(int[] arr){
        // Dictionaries: words near to each other have longer prefix matches so try to re-arrange short part of the array
        int i = arr.length - 1;
        while(i != 0){
            if(arr[i-1] >= arr[i]){
                i--;
            }
            if(arr[i-1] < arr[i]){
                break;
            }
        }
        int pivot = i;
        if(pivot >= 1){
            swap(arr, pivot, pivot-1);
            Arrays.sort(arr, pivot, arr.length-1);
        }
        else{
            Arrays.sort(arr);
        }
        
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
