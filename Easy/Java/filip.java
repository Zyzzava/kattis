import java.util.*;
public class filip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int Areverse = 0, Breverse = 0;
        while(A != 0) {
            int remainder = A % 10;
            Areverse = Areverse * 10 + remainder;
            A = A / 10;
        }
        while(B != 0) {
            int remainder = B % 10;
            Breverse = Breverse * 10 + remainder;
            B = B / 10;
        }
        if(Areverse > Breverse) {
            System.out.println(Areverse);
        }
        else {
            System.out.println(Breverse);
        }
    }
}