import java.util.Scanner;
public class metronome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextInt();
        System.out.println(input/4); // 4 beats per measure
    }
}