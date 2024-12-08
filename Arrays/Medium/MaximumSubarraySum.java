package Arrays.Medium;

// import java.util.Arrays;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane(arr));
    }

    // static int better(int[] arr){ // Will give TLE as complexity is O(N^2)
    //     int maxSum = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         int sum = 0;
    //         for (int j = 0; j < arr.length; j++) {
    //             sum += arr[j];
    //             maxSum = Math.max(maxSum, sum);
    //         }
    //     }
    //     return maxSum;
    // }

    // Brute method used 3 loops

    // Optimal using Kadane's algo

    // The intuition of the algorithm is not to consider the subarray as a part of the answer if its sum is less than 0. A subarray with a sum less than 0 will always reduce our answer and so this type of subarray cannot be a part of the subarray with maximum sum.

    int maxSum = Integer.MIN_VALUE;

    // Time complexity: O(N) since ques is solved in single pass and space complexity is O(1)
    static int kadane(int[] arr){
        int i = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(i < arr.length){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum); // Right place to put
            if(sum < 0){
                sum = 0;
            }
            // maxSum = Math.max(maxSum, sum); // You can't put it here, cases with only -ve elements will give output as 0, which is wrong
            i++;
        }
        return maxSum;
    }
    
}