import java.util.*;
public class oddities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0; i < cases; i++) {
            int x = input.nextInt();
            if(x % 2 == 0) {
                System.out.println(x + " is even");
            }
            else {
                System.out.println(x + " is odd");
            }
        }
    }
}