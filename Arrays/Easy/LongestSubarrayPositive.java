package Arrays.Easy;

import java.util.HashMap;

public class LongestSubarrayPositive {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        System.out.println(betterHashMap(arr, 3));
    }
    static int betterHashMap(int[] nums, int k){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            hash.put(sum, i);
            if(hash.containsKey(k)){
                maxLen = Math.max(maxLen, i);
            }
            if(hash.containsKey(sum - k)){
                maxLen = Math.max(maxLen, i - hash.get(sum-k));
            }
        }
        return maxLen;
    }

}
