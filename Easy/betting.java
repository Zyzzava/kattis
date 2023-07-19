import java.util.Scanner;
public class betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionOnePercent = sc.nextInt();
        double increase = 100 - optionOnePercent;
        double percentageIncreaseOptionOne = (increase / optionOnePercent) + 1;
        double percentageIncreaseOptionTwo = (optionOnePercent / increase) + 1;
        System.out.println(percentageIncreaseOptionOne);
        System.out.println(percentageIncreaseOptionTwo);
    }
}