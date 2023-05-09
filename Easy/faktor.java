import java.util.Scanner;
public class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int articles = sc.nextInt();
        int impactFactor = sc.nextInt();
        System.out.println(articles*(impactFactor-1)+1); // is the formula for the minimum number of scientists that need to cite a paper to get a given impact factor
    }
}