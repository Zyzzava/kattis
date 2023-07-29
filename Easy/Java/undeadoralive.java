import java.util.Scanner;
public class undeadoralive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int smileys = 0;
        int frownies = 0;
        int iplusone = 0;
        for (int i = 0; i < input.length() && iplusone < input.length()-1; i++) {
            iplusone = i + 1;
            if (input.charAt(i) == ':' && input.charAt(iplusone) == ')') {
                smileys++;
            }
            if (input.charAt(i) == ':' && input.charAt(iplusone) == '(') {
                frownies++;
            }
        }
        if (frownies == 0 && smileys != 0)
            System.out.println("alive");
        else if (frownies != 0 && smileys == 0)    
            System.out.println("undead");
        else if (frownies != 0 && smileys != 0)
            System.out.println("double agent");
        else
            System.out.println("machine");
    }
}
