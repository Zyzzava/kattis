import java.util.Scanner;
public class addingtrouble {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x + y != z) {
        System.out.println("wrong!");
    }
    else {
        System.out.println("correct!");
    }
   } 
}
