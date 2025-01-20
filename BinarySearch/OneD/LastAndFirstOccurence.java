package BinarySearch.OneD;

public class LastAndFirstOccurence {

    public static void main(String[] args) {
        int[] arr = {1,3,3,3,3,4};
        System.out.println(firstOccurence(arr, 3));
        System.out.println(lastOccurence(arr, 3));
    }
    // Brute force, you just do linear search and find out the maximum index since the array is sorted
    static int lastOccurence(int[] arr, int target){
        // Ceil
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] > target){
                e = m-1;
            }
            else if(arr[m] <= target){
                ans = m;
                s = m+1;
            }
        }
        if(ans == -1){
            return -1;
        }
        return arr[ans] == target ? ans: -1;
    }

    static int firstOccurence(int[] arr, int target){ // floor
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] >= target){
                ans = m;
                e = m-1;
            }
            else if(arr[m] < target){
                s = m+1;
            }
        }
        if(ans == -1){
            return -1;
        }
        return arr[ans] == target ? ans: -1;
    }

    static int countElements(int[] arr, int target){
        int start = firstOccurence(arr, target);
        int end = lastOccurence(arr, target);
        if(start == -1 || end == -1){
            return 0;
        }
        else{
            return (end-start+1);
        }
    }
}


class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}