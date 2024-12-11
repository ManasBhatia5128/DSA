package BinarySearch.OneD;

public class Search {

    // Intution of binary search: concept of dictionary, when we see dictionary and we want to find a word with i say ice-cream, we randomly open and land on k, then we know that there is no chance that ice-cream will lie on right side of the dictionary
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1,2,4,4,4,4,5,6,6,7,7}, 3));
    }
    static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int lowerBound(int[] arr, int target){ // arr[i] >= x
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= target){
                e = mid-1;
                ans = mid;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int target){ // arr[i] >= x
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= target){
                e = mid-1;
                ans = mid;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
        }
        return ans;
    }

    // Search insert: lower bound basically, we simply have to find insert postiton

    // Floor: largest no in array <= x
    static int floor(int[] arr, int target){ // arr[i] >= x
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] <= target){
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }

    // Ceil: lower bound >= x
}
