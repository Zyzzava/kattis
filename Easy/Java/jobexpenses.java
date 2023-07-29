import java.util.*;
public class jobexpenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int expenses = 0;
        for(int i = 0; i < cases; i++) {
            int x = input.nextInt();
            if(x <= 0) {
                expenses -= x;
            }
        }
        System.out.println(+expenses);
    }
}