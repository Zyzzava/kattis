import java.util.Scanner;
public class stopwatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int[] times = new int[n];
            for (int i = 0; i < n; i++) {
                times[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum += times[i + 1] - times[i];
                }
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("still running");
        }
    }
}
