import java.util.*;
public class electricaloutlets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int total = 1;
        for(int i = 0; i < cases; i++) {
            int numberofOutlets = input.nextInt();
            for(int k = 0; k < numberofOutlets; k++) {
                total += input.nextInt()-1;
            }
            System.out.println(total);
            total = 1;
        }
    }
}