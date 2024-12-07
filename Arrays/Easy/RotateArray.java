package Arrays.Easy;

public class RotateArray {
    static void rotateRightUsingTempArray(int[] arr, int k){ // This method takes linear TC
        k = k % arr.length; // We do this to avoid multiple rotations
        int[] newArr = new int[arr.length];
        int count = 0;
        for(int i = arr.length - k; i < arr.length; i++){
            newArr[count] = arr[i];
            count++;
        }
        for(int j = 0; j < arr.length - k; j++){
            newArr[count] = arr[j];
            count++;
        }
        System.arraycopy(newArr, 0, arr, 0, arr.length); // O(N) time complexity for this step
    }
}
