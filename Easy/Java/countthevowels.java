import java.util.Scanner;
public class countthevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            char character = Character.toLowerCase(input.charAt(i));
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o'|| character == 'u') {
                count++;
            }
        }
        System.out.println(count);   
    }
}
