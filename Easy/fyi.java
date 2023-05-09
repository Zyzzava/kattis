import java.util.*;
public class fyi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();

        while (number1 > 0) {
            digits.add( number1 % 10);
            number1 = number1 / 10;
        }
        ArrayList<Integer> digitsReversed = new ArrayList<>();
        for(int i = 1; i <= digits.size(); i++) {
            digitsReversed.add(digits.get(digits.size()-i));
        }
        if(digitsReversed.get(0) == 5 && digitsReversed.get(1) == 5 && digitsReversed.get(2) == 5) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}