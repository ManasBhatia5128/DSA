package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Brute: Check for other element if it is equal to sum - (elem1)
    // Better: Use hashing

    public static void main(String[] args) {
        int[] arr = {3,3};
        int k = 6;
        System.out.println(Arrays.toString(better(arr, k)));

    }
    static int[] better(int[] nums, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int ans1 = -1;
        int ans2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if(hash.containsKey(target - nums[i])){
                ans1 = hash.get(target-nums[i]);
                ans2 = i;
                break;
            }
            hash.put(nums[i], i); // This statement should be after the condition in order to avoid errors of cases such as [3,3] and target is 6
        }
        return new int[]{ans1, ans2};
    }

    static int optimalTwoPointer(int[] nums, int target){ // Not that optimal, TC will increase to O(NlogN), however space complexity will become O(1)
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if(nums[i] + nums[j] < target && j == i+1){
                i++;
                j++;
            }
            if(nums[i] + nums[j] < target && j != i+1){
                j++;
            }

        }
        return 0;
    }
}

// if(hash.containsKey(target - nums[i])){
//     if(target == 2 * nums[i]){
//         ans1 = hash.get(target - nums[i]);
//         ans2 = i;
//     }
//     else{
        
//     }
// }