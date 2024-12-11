package BinarySearch.OneD;

public class LastOccurence {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,5,5,6};
        System.out.println(lastOccurence(arr, 4));
    }
    // Brute force, you just do linear search and find out the maximum index since the array is sorted
    static int lastOccurence(int[] arr, int target){
        // This just feels like lowerbound
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2; // done this way in order to not break the integer limits (int+int) types
            if(arr[mid] >= target){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if(ans == -1){
            return ans;
        }
        return arr[ans] == target ? ans : ans-1;
    }
}
