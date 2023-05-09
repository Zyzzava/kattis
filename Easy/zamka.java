import java.util.Scanner;
public class zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        for(int i = L; i <= D; i++) {
            int sum = 0;
            int temp = i;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == X) {
                System.out.println(i);
                break;
            }
        }
        for(int i = D; i >= L; i--) {
            int sum = 0;
            int temp = i;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == X) {
                System.out.println(i);
                break;
            }
        }    
    }
}
