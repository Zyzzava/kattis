import java.util.*;
public class oddecho {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int wordCount = input.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < wordCount+1; i++) {
            words.add(input.nextLine());
        }
        for(int i = 0; i < words.size(); i++) {
            if(i % 2 != 0) {
                System.out.println(words.get(i));
            }
        }
    }
}