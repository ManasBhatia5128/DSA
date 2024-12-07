package Arrays.Easy;

import java.util.ArrayList;

// import java.util.HashSet;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 =  {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        System.out.println(union(arr1, arr2));
    }
    // Brute and better methods take O((M+N)Log(M+N)) time due to hashing operations in Map and Set
    // Best is to use two pointer technique, we can take benefit of the fact that arrays are sorted
    static ArrayList<Integer> union(int[] arr1, int[] arr2){
        int i1 = 0;
        int i2 = 0;
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> result = new ArrayList<>();
        while(i1 < m && i2 < n){
            if(arr1[i1] < arr2[i2]){
                result.add(arr1[i1]);
                i1++;
            }
            else if(arr1[i1] == arr2[i2]){
                result.add(arr1[i1]);
                i1++;
                i2++;
            }
            else{
                result.add(arr2[i2]);
                i2++;
            }
        }
        while(i1 < m){
            result.add(arr1[i1]);
            i1++;
        }
        while(i2 < n){
            result.add(arr2[i2]);
            i2++;
        }
        return result;
    }
}
