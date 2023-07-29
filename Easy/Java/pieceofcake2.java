import java.util.Scanner;
public class pieceofcake2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();

        int h2 = n - h;
        int h1 = n - h2;
        int w2 = n - v;
        int w1 = n - w2;

        int Q1 = h1*w1;
        int Q2 = h1*w2;
        int Q3 = h2*w1;
        int Q4 = h2*w2;

        // Find max.
        int max = Q1;
        if(max < Q2) {
            max = Q2;
        }
        if(max < Q3) {
            max = Q3;
        }
        if(max < Q4) {
            max = Q4;
        }

        System.out.println(max*4);
    }
}
