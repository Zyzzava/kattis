import java.util.*;
import java.util.HashMap;
public class pet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> contestants = new HashMap<>();
        int temp = 0;
        for(int i = 1; i < 6; i++) {
            for(int k = 0; k < 4; k++) {
                temp += input.nextInt();
            }
            contestants.put(i,temp);
            temp = 0;
        }
        Integer winner = null;
        for(Integer i : contestants.values()) {
            if(winner == null || i > winner) {
                winner = i;
            }
        }
        Integer contestant = null;
        for(Integer i : contestants.keySet()) {
            if(winner == contestants.get(i)) {
                contestant = i;
            }
        }
        System.out.println(contestant + " " + winner);
    }
}