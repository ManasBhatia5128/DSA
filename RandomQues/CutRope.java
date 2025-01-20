import java.util.ArrayList;
import java.util.List;
public class CutRope {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(arr));
    }
    static int cutRod(int[] price){
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < price.length; i++) {
            list.add(new Pair(price[i], i+1));
        }
        list.sort((a, b) -> Double.compare((a.val * 1.0 / a.index), (b.val * 1.0 / b.index)));
        int lengthDone = 0;
        int actualLength = price.length;
        int maxSum = 0;
        int i = 0;
        while(lengthDone < actualLength){
            while(lengthDone < actualLength){
                lengthDone += list.get(list.size() - i - 1).index;
                maxSum += list.get(list.size() - i-1).val;
            }
            if(lengthDone == actualLength){
                break;
            }
            lengthDone -= list.get(list.size() - i - 1).index;
            maxSum -= list.get(list.size() - i-1).val;
            i++;
        }
        return maxSum;
    }
}
class Pair{
    int val;
    int index;
    Pair(int val, int index){
        this.val = val;
        this.index = index;
    }
}