package Arrays.Easy;

public class SndLargest {
    static int sndLargestBetter(int[] arr){
        // We can find even without sorting, ie by using two traversals
        int maxElem = Integer.MIN_VALUE;
        int sndMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxElem = Math.max(maxElem, arr[i]);
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != maxElem){
                sndMax = Math.max(sndMax, arr[j]);
            }
        }
        return sndMax;
    }

    static int sndLargestOptimal(int[] arr){
        int maxElem = Integer.MIN_VALUE;
        int sndMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxElem && arr[i] > sndMax){
                sndMax = maxElem;
                maxElem = arr[i];
            }
            else if(arr[i] < maxElem && arr[i] > sndMax){
                sndMax = arr[i];
            }
        }
        return sndMax == Integer.MIN_VALUE ? -1 : sndMax;
    }
}
