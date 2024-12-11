package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 4, 1};
        System.out.println(leaders(arr));
    }

    // Brute method: pretty simple just check for all the elements
    // {newLeader > bich ke elements > leader > other elements}
    // All the elements on right of leader will also be smaller than newLeader
    // To reject, just check if smaller elem on right
    // To accept, just check bich ke elements and leader

    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[arr.length-1]);
        int i = arr.length - 2;
        int prevLeader = 0;
        while(i >= 0){
            boolean leader = true;;
            int j = i+1;
            while(j < arr.length){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
                if(arr[i] > arr[prevLeader] && j >= prevLeader){
                    leader = true;
                    break;
                }
                j++;
            }
            if(leader){
                ans.add(arr[i]);
                prevLeader = i;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}
