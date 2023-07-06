import java.util.ArrayList;
import java.util.Scanner;
public class ghostleg {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[] vs = new int[n];
       for(int i = 0; i < n; i++) {
        vs[i] = i;
       }
       for(int j = 0; j < m; j++) {
        int a = sc.nextInt();
        int temp = vs[a-1];
        vs[a-1] = vs[a];
        vs[a] = temp;
       }
       for(int k = 0; k < n; k++) {
        System.out.println(vs[k]+1);
       }
    }
}