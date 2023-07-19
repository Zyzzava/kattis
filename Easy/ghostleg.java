import java.util.ArrayList;
import java.util.Scanner;

public class ghostleg {
    private static class Pair<T, U> {
        public final T first; 
        public final U second;
    
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getKey() {
            return first;
        }

        public U getValue() {
            return second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementsNum = sc.nextInt(); // number of elements
        int rungsNum = sc.nextInt(); // number of rungs
        // We want an ArrayList which is going to be holding an integer pair, that is the rungs 
        // and the elements that are connected to that rung.
        ArrayList<Pair<Integer, Integer>> rungs = new ArrayList<>();
        for (int i = 0; i < rungsNum; i++) {
            int a = sc.nextInt() - 1; // 0-based indexing
            int b = sc.nextInt() - 1;
            rungs.add(new Pair<>(a, b));
        }
        int[] result = new int[elementsNum];
        for (int i = 0; i < elementsNum; i++) {
            int curLine = i;
            for (Pair<Integer, Integer> rung : rungs) {
                int a = rung.getKey();
                int b = rung.getValue();
                if (curLine == a) {
                    curLine = b;
                } else if (curLine == b) {
                    curLine = a;
                }
            }
            result[curLine] = i + 1; // 1-based indexing
        }
        for (int i = 0; i < elementsNum; i++) {
            System.out.println(result[i]);
        }
    }
}

