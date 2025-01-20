package BinarySearch.OneD;

public class RotatedSortedArray {
    // [7,8,9,1,2,3,4,5,6], main baat kya bn rhi hai, In binary search, we just check on one half
    // Firstly, identify the sorted half
    // in sorted arr[s] < arr[mid] < arr[e]

    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(searchRotated(arr, 10));
    }

    static int searchRotated(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            if(arr[m] == target){
                return m;
            }
            else if(arr[l] <= arr[m]){//= for case of l == m
                if(arr[l] <= target && target <= arr[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
            else{
                if(arr[m] <= target && target <= arr[e]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
        }
        return -1;
    }

    static boolean searchRotatedDuplicates(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                return true;
            } // Check firsly before changing the array
            // if(arr[s] == arr[m] && arr[m] == arr[e] && s < arr.length-1 && e > 0){
            //     s++;
            //     e--;
            //     continue;
            // }

            // Conversly you can also do
            while (s < m && arr[s] == arr[m]) s++;
            while (e > m && arr[e] == arr[m]) e--;

            else if(arr[s] <= arr[m]){//= for case of l == m
                if(arr[s] <= target && target <= arr[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
            else{
                if(arr[m] <= target && target <= arr[e]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
        }
        return false;
    }
}