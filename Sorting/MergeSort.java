package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,3,2,4,5,2,2,7,8,6,7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int l, int h){
          if(l >= h){
            return;
        }
        int mid = l + (h-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr, l, mid, h);
    }
    static void merge(int[] arr, int l, int m, int h){
        int index1 = l;
        int index2 = m+1;
        int count = 0;
        int[] temp = new int[h-l+1];
        while (index1 <= m && index2 <= h) {
            if(arr[index1] <= arr[index2]){
                temp[count] = arr[index1];
                index1++;
                count++;
            }
            else if(arr[index1] > arr[index2]){
                temp[count] = arr[index2];
                index2++;
                count++;
            }
        }
        while (index1 <= m) {
            temp[count] = arr[index1];
            index1++;
            count++;
        }
        while(index2 <= h){
            temp[count] = arr[index2];
            index2++;
            count++;
        }
        count = 0;
        for(int j = l; j < h; j++){
            arr[j] = temp[count];
            count++;
        }
    }
}
