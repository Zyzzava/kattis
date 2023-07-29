import java.util.*;
public class autori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        String finalWorld = "";
        for(int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if(Character.isUpperCase(character)) {
                finalWorld = finalWorld + character;
            }
        }
        System.out.println(finalWorld);
    }
}