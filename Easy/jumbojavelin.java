import java.util.Scanner;
public class jumbojavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfLengths = 0;
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            sumOfLengths += length-1;
        }
        System.out.println(sumOfLengths+1);
    }
}
