import java.util.*;
public class nsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int result = 0;
        for(int i = 0; i < cases; i++) {
            result += input.nextInt();
        }
        System.out.println(result);
    }
}