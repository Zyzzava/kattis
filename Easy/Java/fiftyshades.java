import java.util.*;
import java.util.Scanner;
public class fiftyshades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int result = 0;
        for(int i = 0; i < cases; i++) {
            String x = input.next().toLowerCase();
            if(x.contains("rose") || x.contains("pink")) {
                result++;
            }
        }
        if(result != 0) {
            System.out.println(result);
        }
        else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}