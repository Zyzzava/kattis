import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        String[] numbers = new String[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = Integer.toString(i+1);
        }
        for(int j = 0; j < n; j++) {
            double temp1 = (double) Integer.parseInt(numbers[j])/x;
            double temp2 = (double) Integer.parseInt(numbers[j])/y;
            if(temp1 % 1 == 0 && temp2 % 1 == 0) {
                numbers[j] = "FizzBuzz";
            }
            else if(temp1 % 1 == 0) {
                numbers[j] = "Fizz";
            }
            else if(temp2 % 1 == 0) {
                numbers[j] = "Buzz";
            }
        }
        for(String num : numbers) {
            System.out.println(num);
        }
    }
}