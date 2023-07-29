import java.util.Scanner;
public class fadingwind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int k = sc.nextInt();
        int v = sc.nextInt();
        int s = sc.nextInt();
        int distance = 0;
        while(h > 0) {
            v += s;
            v -= Math.max(1, (int) Math.floor((double) v / 10));
            if(v >= k) {
                h++;
            }
            else if(v < k && v > 0) {
                h--;
                if(h == 0) {
                    v = 0;
                }
            }
            else if (v <= 0){
                h = 0;
                v = 0;
            }
            if(s > 0) {
                s--;
            }
            distance += v;
        }
        System.out.println(distance);
    }
}
