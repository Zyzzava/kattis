import java.util.Scanner;
public class planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Number of points per 'row'
        int points = 2;
        // Count up the points per 'row' by taking last iteration and adding points on row - 1
        for (int i = 0; i < n; i++) {
            points += points - 1;
        }
        // We find the total points by saying points in row * points in row.
        System.out.println(points * points);
    }
}
