import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class pokechat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encoding = sc.nextLine();
        String code = sc.nextLine();
        String[] codes = code.split("(?<=\\G...)");
        String result = "";
        for(String c : codes) {
            if(c.charAt(0) == '0' && c.charAt(1) == '0') {
                result+=encoding.charAt(Character.getNumericValue(c.charAt(2))-1);
            }
            else {
                result+=encoding.charAt(Integer.parseInt(c.charAt(1)+""+c.charAt(2))-1);
            }
        }
        System.out.println(result);
    }
}
