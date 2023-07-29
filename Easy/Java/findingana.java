import java.util.*;
public class findingana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String finalWord = "";
        int k = 0;
        for(int i = k; i < word.length(); i++) {
            char character = word.charAt(i);
            if (character == 'a') {
                finalWord = finalWord + character;
                k = i;
                break;
            }
        }
        for(int i = k+1; i < word.length(); i++) {
            char character = word.charAt(i);
            finalWord = finalWord + character;
        }
        System.out.println(finalWord);
    }
}
