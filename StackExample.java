import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        System.out.println(stack);

        String topElement = stack.pop();
        System.out.println("Popped element: " + topElement);

        System.out.println(stack);
    }
}