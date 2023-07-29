import java.util.*;
public class spavanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();
        if(hour >= 1) {
            if(minute - 45 < 0) {
                hour -= 1;
                minute += 60;
                minute -= 45;
            }
            else if(minute - 45 >= 0) {
                minute -= 45;
            }
        }
        else if(hour == 0) {
            hour += 24;
            if(minute - 45 < 0) {
                hour -= 1;
                minute += 60;
                minute -= 45;
            }
        }
        System.out.println(hour + " " + minute);
    }
}