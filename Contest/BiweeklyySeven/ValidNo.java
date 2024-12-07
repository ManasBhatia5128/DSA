package Contest.BiweeklyySeven;

// import java.util.Arrays;
import java.util.HashMap;

public class ValidNo {
    public static void main(String[] args) {
        // int[] arr = {9,7,7,5,3};
        // System.out.println(valid(arr, 0));
        System.out.println();
    }
    static int valid(int[] nums, int k){
        if(k >= max(nums)){
            return -1;
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }
        if(hash.containsKey(k)){
            return hash.size() - 1;
        }
        else{
            return hash.size();
        }
    }
    static int max(int[] arr){
        int maxElem = 0;
        for(int elem: arr){
            maxElem = Math.max(maxElem, elem);
        }
        return maxElem;
    }
}
