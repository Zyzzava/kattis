import java.util.Scanner;
public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ball = 1;
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                if (ball == 1) {
                    ball = 2;
                }
                else if (ball == 2) {
                    ball = 1;
                }
            }
            else if (input.charAt(i) == 'B') {
                if (ball == 2) {
                    ball = 3;
                }
                else if (ball == 3) {
                    ball = 2;
                }
            }
            else if (input.charAt(i) == 'C') {
                if (ball == 1) {
                    ball = 3;
                }
                else if (ball == 3) {
                    ball = 1;
                }
            }
        }
        System.out.println(ball);        
    }
}
