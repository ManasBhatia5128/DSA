public class MinRotatedSorted{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2}; 
        System.out.println(minElement(arr));
    }

    static int minElement(int[] arr){
        // basically, firstly identify the sorted half, update minElement with least value of sorted half and now continue searching in the unsorted half, in case of rotated min element can lie either on sorted or usorted half
        int l = 0;
        int h = arr.length - 1;
        int minElement = Integer.MAX_VALUE;
        while (l <= h) {
            int m = l + (h-l)/2;
            if(arr[l] <= arr[m]){
                minElement = Math.min(minElement, arr[l]);
                l = m+1;
            }
            else{
                minElement = Math.min(minElement, arr[m]);
                h = m-1;
            }
        }
        return minElement;
    }

    static int maxElement(int[] arr){
        // basically, firstly identify the sorted half, update maxElement with least value of sorted half and now continue searching in the unsorted half, in case of rotated min element can lie either on sorted or usorted half
        int l = 0;
        int h = arr.length - 1;
        int maxElement = Integer.MIN_VALUE;
        while (l <= h) {
            int m = l + (h-l)/2;
            if(arr[l] <= arr[m]){
                maxElement = Math.max(maxElement, arr[m]);
                l = m+1;
            }
            else{
                maxElement = Math.max(maxElement, arr[h]);
                h = m-1;
            }
        }
        return maxElement;
    }
}