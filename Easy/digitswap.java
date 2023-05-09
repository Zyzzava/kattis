import java.util.*;
public class digitswap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();

        while (number1 > 0) {
            digits.add( number1 % 10);
            number1 = number1 / 10;
        }
        String totalNumber = "";
        for(int i = 0; i < digits.size(); i++) {
            totalNumber += digits.get(i);
        }
        System.out.println(totalNumber);

    }
}