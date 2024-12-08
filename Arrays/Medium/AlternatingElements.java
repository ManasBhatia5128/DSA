package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AlternatingElements {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-5,4,-6,4,5,6,6};
        System.out.println(Arrays.toString(case2(arr)));
        System.out.println(Collections.nCopies(5, 0).getClass().getName());
    }

    // Brute: Store +ve and -ve elem seperately then add them in the answer array one by one alternatively



    // It is the most optimal approach if both positive and negative elements are equal
    static int[] alternatingElements(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int countE = 0;
        int countO = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans[countE] = arr[i];
                countE += 2;
            }
            else{
                ans[countO] = arr[i];
                countO += 2;
            }
        }
        return ans;
    }

    // Case-2, elements are not equal
    // If we follow a similar approach, then we can use an arraylist instead of array and later remove the zeroes
    // m are positive, n are negative and m > n TC = O(m+n) + O(2n){for array traversal till elements are equal} + O(2*(m-n)){since we have to shift this no of elements and zeroes left}

    static int[] case2(int[] arr){

        // Most IMP Point, a given arraylist or list in java is not initialised with zeroes even if its size is declared, so it will throw IndexOfBounds when you try to access an element which is not intialised
        // List<Integer> li = new ArrayList<>(2*arr.length); // why declare list or arraylist, find differnece
            ArrayList<Integer> li = new ArrayList<>(Collections.nCopies(2*arr.length, 0));// This is the correct way
            int countE = 0;
            int countO = 1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > 0){
                    li.add(countE, arr[i]);
                    li.remove(countE+1);
                    countE += 2;
                }
                else{
                    li.add(countO, arr[i]);
                    li.remove(countO+1);
                    countO += 2;
                }
            }
            int[] ans = new int[arr.length];
            int count = 0;
            for (int i = 0; i < li.size(); i++) {
                if(li.get(i) == 0){
                    continue;
                }
                ans[count] = li.get(i);
                count++;
            }
            return ans;
    }

    // We can also make pos and neg arrays
    // TC = O(2*n){length of given array} + O(n){for iteration of putting elements} + O(2m1 + 2*(m1-m2))
    // m1: +ve m2: -ve and m1 > m2
    // SC = O(2*n){for arraylist} + O(n){for returning answer}, this is auxillary or extra space
    // O(n){input array} + auxillary space = total space

}