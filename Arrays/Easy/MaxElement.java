package Arrays.Easy;

public class MaxElement {
    public static void main(String[] args) {
        
    }
    static int maxElementBrute(int[] arr){
        int maxElem = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxElem = Math.max(maxElem, arr[i]);
        }
        return maxElem;
    }
    // M2 is using sorting
}
