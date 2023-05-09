import java.util.*;
public class nastyhacks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for(int i = 0; i < cases; i++) {
            int r = input.nextInt();
            int e = input.nextInt();
            int c = input.nextInt();
            if(e-c > r) {
                System.out.println("Advertise");
            }
            else if(e-c < r) {
                System.out.println("do not advertise");
            }
            else{
                System.out.println("does not matter");
            }
        }

    }
}