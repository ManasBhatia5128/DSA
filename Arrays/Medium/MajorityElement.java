package Arrays.Medium;

public class MajorityElement {

        public static void main(String[] args) {
            int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
            System.out.println(optimal(arr));
        }

    // Brute: simply linear search for each element: O(N^2) complexity
    // Better: Hashing
    static int betterMajority(int[] arr){ // simply using HashMap
        return 0;
        // TC = O(N) for insertion in unordered map + O(N) for checking the element
        // SC = O(N) not O(N/2) due to maps

    }

    static int optimal(int[] arr){
        // We use moore's voting algo
        // [2,2,1,1,1,2,2]
        // check for 2, ie count = 1 2 1 0 ie [2,2,1,1] are cancelled, we can't find max element in this part of array
        // Now we are at [2,2,1,1,1`,2,2] ie [1,2], 1 is not max element
        // Now [2]: count = 1 for elem = 1, majority elment will be 1 if it exists

        int count = 0;
        int elem = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count == 0){
                elem = arr[i];
            }
            if(arr[i] == elem){
                count++;
            }
            else if(arr[i] != elem){
                count--;
            }
        }
        return elem;
    }
}
