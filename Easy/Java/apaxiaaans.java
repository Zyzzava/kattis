import java.util.*;
public class apaxiaaans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String product = "";
        product += name.charAt(0);
        for(int i = 1; i < name.length(); i++) {
            if(name.charAt(i) != name.charAt(i-1)) {
                product += name.charAt(i);
            }
        }
        System.out.println(product);
    }
}