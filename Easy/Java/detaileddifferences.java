import java.util.Scanner;
public class detaileddifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String string1 = sc.next();
            String string2 = sc.next();
            String result = "";
            for(int j = 0; j < string1.length(); j++) {
                if(string1.charAt(j) != string2.charAt(j)) {
                    result += "*";
                }
                else {
                    result += ".";
                }
            }
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(result);
            System.out.println();
        }
    }
}
