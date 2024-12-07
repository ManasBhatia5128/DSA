package Arrays.Medium;

import java.util.Arrays;

public class AlternatingElements {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-5,4,-6};
        System.out.println(Arrays.toString(alternatingElements(arr)));
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
}
