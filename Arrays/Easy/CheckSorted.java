package Arrays.Easy;

public class CheckSorted {
    static boolean checkSortedBrute(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    } // Unnecesarily O(N^2)

    static int checkSortedBetter(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
}
