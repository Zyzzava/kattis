import java.util.Scanner;
public class greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int numE = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'e') {
                numE++;
            }
        }
        System.out.print("h" + "e".repeat(numE*2) + "y");
    }
}