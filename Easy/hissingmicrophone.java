import java.util.*;
import java.util.Scanner;
public class hissingmicrophone {
    static Scanner input = new Scanner(System.in);
    static String word = input.next();
    public static void main(String[] args) {
        System.out.println(mainMethod());
    }
    public static String mainMethod() {
        for(int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i) == 's' && word.charAt(i+1) == 's') {
                return "hiss";
            }
        }
        return "no hiss";
    }
}