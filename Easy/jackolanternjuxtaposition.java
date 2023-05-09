import java.util.Scanner;
public class jackolanternjuxtaposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt(); // number of eyes
        int m = sc.nextInt(); // number of mouths
        System.out.println(n*t*m);
    }
}
