package Arrays.Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(twoPointer(arr));
    }
    static int brute(int[] arr){ // O(N^2) complexity thus you'll get TLE error
        int countMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                int j = i;
                int count = 0;
                while(j < arr.length && j != 0){
                    count++;
                    count = Math.max(count, countMax);
                }
            }
        }
        return countMax;
    }
    // static int betterUsingHashing(int[] arr){
    //      EZee 
    // }
    static int twoPointer(int[] arr){
        int maxCount = 0;
int count = 0; // Keeps track of the current streak of 1s

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 1) {
        count++; // Increment count for consecutive 1s
        maxCount = Math.max(maxCount, count); // Update max streak
    } else {
        count = 0; // Reset count on encountering 0
    }
}
return maxCount;

    }
}
