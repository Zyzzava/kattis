import java.util.*;
public class isithalloween {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String month = input.next();
        int date = input.nextInt();
        if(month.equals("OCT") && date == 31) {
            System.out.println("yup");
        }
        else if(month.equals("DEC") && date == 25) {
            System.out.println("yup");
        }
        else{
            System.out.println("nope");
        }
    }
}