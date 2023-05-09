import java.util.*;
public class gcvwr {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int G = input.nextInt();
        int T = input.nextInt();
        int N = input.nextInt();
        int towingCapacity = G - T;
        double maxTowingCapacity = 0.90*towingCapacity;
        int weightOfItems = 0;
        for(int i = 0; i < N; i++) {
            weightOfItems += input.nextInt();
        }
        System.out.println((int)maxTowingCapacity-weightOfItems);
    }
}