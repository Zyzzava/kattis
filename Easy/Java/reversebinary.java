import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
public class reversebinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String bitRepresentation = Integer.toBinaryString(number);
        String bitRepresentationReversed = "";
        for(int i = bitRepresentation.length(); i > 0; i--) {
            bitRepresentationReversed += bitRepresentation.charAt(i-1);
        }
        int finalNumber = Integer.parseInt(bitRepresentationReversed,2);
        System.out.println(finalNumber);
    }
}