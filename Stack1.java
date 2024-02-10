import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println(a);
        System.out.println(a.peek());
        a.pop();
        System.out.println(a);
        System.out.println(a.empty());
    }
}
