import java.util.*;
public class grassseed {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cost = input.nextDouble();
        double noOfLawns = input.nextDouble();
        double squareMeters = 0;
        for(int i = 0; i < noOfLawns; i++) {
            double width = input.nextDouble();
            double length = input.nextDouble();
            squareMeters += width*length;
        }
        System.out.println(squareMeters*cost);
    }
}