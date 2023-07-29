import java.util.*;
import java.util.Scanner;
public class everywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0; i < cases; i++) {
            int noOfCities = input.nextInt();
            ArrayList<String> cities = new ArrayList<>();
            for(int k = 0; k < noOfCities; k++) {
                cities.add(input.next());
            }
            System.out.println(cities.stream()
                    .distinct()
                    .count());
        }
    }
}