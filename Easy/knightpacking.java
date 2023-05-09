import java.util.Scanner;
public class knightpacking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 1)  {
            System.out.println("first");
        }
        else {
            System.out.println("second");
        }
    }
}