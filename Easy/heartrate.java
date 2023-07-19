import java.util.Scanner;
public class heartrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt(); 
        for (int i = 0; i < caseNum; i++) {
            int b = sc.nextInt();
            double p = sc.nextDouble();
            double bpm = 60 * b / p;
            double abpm = 60 / p;
            System.out.println((bpm - abpm) + " " + bpm + " " + (bpm + abpm));
        }
    }
}
