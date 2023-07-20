import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class nodup {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    boolean containsDup = checkForDuplicates(line);
    if(containsDup) {
        System.out.println("no");
    }
    else {
        System.out.println("yes");
    }
   } 
   private static boolean checkForDuplicates(String sentence) {
    Set<String> uniqueWords = new HashSet<>();
    String[] splitted = sentence.split(" ");
    for(String word : splitted) {
        if(!uniqueWords.add(word.toLowerCase())) {
            return true;
        }
    }
    return false;
   }
}
