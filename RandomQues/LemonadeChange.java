package RandomQues;

import java.util.HashMap;

public class LemonadeChange {
    static boolean lemonadeChange(int[] bills){
        if(bills[0] != 5){
            return false;
        }
        if(bills[0] == 5 && bills.length == 1){
            return true;
        }
        HashMap<Integer, Integer> notes = new HashMap<>();
        for (int i = 1; i < bills.length; i++) {
            if(bills[i] == 5){
                notes.put(5, notes.getOrDefault(5,0) + 1);
            }
            else if(bills[i] == 10){
                notes.put(10, notes.getOrDefault(10,0) + 1);
                if(notes.get(5) > 0){
                    notes.put(5, notes.get(5)-1);
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                notes.put(20, notes.getOrDefault(20,0) + 1);
                if((notes.get(5) > 0) && (notes.get(10) > 0)){
                    notes.put(10, notes.get(10) -1);
                    notes.put(5, notes.get(5) - 1);
                }
                else if(notes.get(5) >= 3){
                    notes.put(5, notes.get(5)-3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
