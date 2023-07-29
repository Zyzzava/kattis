import java.util.*;
public class ratingproblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalJudges = input.nextInt();
        int totalJudgesRated = input.nextInt();
        double min = 0;
        double max = 0;
        double temp = 0;
        for(int i = 0; i < totalJudgesRated; i++) {
            temp += input.nextInt();
        }
        min = temp;
        max = temp;
        for(int i = 0; i < totalJudges - totalJudgesRated; i++) {
            min += -3;
            max += 3;
        }
        System.out.println(min/totalJudges + " " + max/totalJudges);
    }
}