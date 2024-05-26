import java.util.Stack;

public class Number5 {

    
    public static String reverseString(String input) {
        
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

       
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString(); 
    }

    // Example 
    public static void main(String[] args) {
        String input = "hello"; 
        String output = reverseString(input); 
        System.out.println("Reversed string: " + output);
    }
}
