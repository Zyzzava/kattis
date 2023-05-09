import java.util.*;
import java.lang.Math;
public class pot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result = 0;
        for(int i = 0; i < N; i++) {
            int number = input.nextInt();
            int digit = number % 10;
            result += Math.pow(number/10,digit);
        }
        System.out.println(result);
    }
}
