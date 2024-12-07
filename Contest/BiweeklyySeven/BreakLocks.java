package Contest.BiweeklyySeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BreakLocks {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(7,3,6,18,22,50));
        int k = 1;
        System.out.println(findMinimumTime(arr, k));
    }

    static int findMinimumTime(List<Integer> strength, int k) {
        int x = 1;
        int energy = 0;
        Collections.sort(strength);
        int time = 0;
        while(!strength.isEmpty()){
            energy += time*x;
            if(energy >= strength.get(0)){
                int i = 0;
                while(i < strength.size()){
                    if(strength.get(i) > energy){
                        break;
                    }
                    i++;
                }
                strength.remove(i-1);
                energy = 0;
                x += k;
            }
            time++;
        }
        return time;
    }
}
