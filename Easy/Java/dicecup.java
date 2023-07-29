import java.util.*;

public class dicecup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] favorableCounts = new int[n+m+1];
        int maxCount = 0;
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < m+1; j++) {
                int sum = i+j;
                favorableCounts[sum]++;
                maxCount = Math.max(favorableCounts[sum], maxCount);
            }
        }
        // Find the max counts
        ArrayList<Integer> maxCounts = new ArrayList<>();
        for(int sum = 2; sum < m+n; sum++) {
            if(favorableCounts[sum] == maxCount) {
                maxCounts.add(sum);
            }
        }
        // Print in increasing order
        Collections.sort(maxCounts);
        for(int max : maxCounts) {
            System.out.println(max);
        }
    }
}