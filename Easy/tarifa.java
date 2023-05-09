import java.util.*;
public class tarifa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int megabytes = input.nextInt();
        int months = input.nextInt();
        int totalSpent = 0;
        for(int i = 0; i < months; i++) {
            totalSpent += input.nextInt();
        }
        System.out.println(megabytes*months-totalSpent+megabytes);
    }
}