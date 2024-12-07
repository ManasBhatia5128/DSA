package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        
    }
    // Method of hashing, TC is O(N + N) and SC is also O(N)
    static int betterMethod(int[] arr){
        int[] hash = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        for (int j = 0; j < hash.length; j++) {
            if(hash[j] == 0){
                return j;
            }
        }
        return -1; // Unreachable code, agar test cases sahi hain toh koi na koi fas hi jayega
    }

    // static int optimalUsingXor(int[] arr){
        
    // }

    // static int optimalUsingSummation(int[] arr){

    // }
    
}
