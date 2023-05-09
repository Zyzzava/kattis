import java.util.Scanner;
public class batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atBats = sc.nextInt();
        int totalBases = 0;
        int totalBats = 0;
        for(int i = 0; i < atBats; i++) {
            int input = sc.nextInt();
            if(input != -1) {
                totalBases += input;
                totalBats++;
            }
        }
        System.out.println((double)totalBases/totalBats);
    }
}
