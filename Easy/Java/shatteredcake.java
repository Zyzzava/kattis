import java.util.Scanner;
public class shatteredcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int area = 0;
        for (int i = 0; i < n; i++) {
            int wi = sc.nextInt();
            int li = sc.nextInt();
            area += wi * li;
        }
        System.out.println(area / w);
    }
}
