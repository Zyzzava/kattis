import java.util.Scanner;
import java.util.Stack;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int beforeEye = 0;
        int afterEye = 0;
        for(int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        while(!stack.isEmpty()) {
            afterEye++;
            stack.pop();
            if(stack.peek() == ')') {
                stack.pop();
                stack.pop();
                while(!stack.isEmpty()) {
                    beforeEye++;
                    stack.pop();
                }
            }
        }
        if(beforeEye != afterEye) {
            System.out.println("fix");
        }
        else {
            System.out.println("correct");
        }
    }
}
