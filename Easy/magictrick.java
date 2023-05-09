import java.util.*;
import java.util.Scanner;

public class magictrick {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }
        if(count > 0) {
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
}