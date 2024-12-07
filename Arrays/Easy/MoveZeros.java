package Arrays.Easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,3,2,0,0,2,4,0,9,67,0,5,0,6,0,34,0,34,45};
        // moveToEndUsingTemp(arr);
        moveZerosOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveToEndUsingTemp(int[] arr){
        int[] temp = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp[count] = arr[i];
                count++;
            }
        }// O(N) for the loop
        System.arraycopy(temp, 0, arr, 0, arr.length); // O(N) for copying
    }

    static void moveZerosOptimal(int[] arr){
        if(arr.length <= 1){
            return;
        }
        // We use a two pointer approach, we are trying to move the non zero elements to the left
        int i = 0;
        int j = 1;
        // j is the swapping no and i will always be at 0
        while (j < arr.length) {
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
