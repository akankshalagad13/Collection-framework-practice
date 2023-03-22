import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        animals.push("lions");
        animals.push("tiger");
        animals.push("horse");
        animals.push("Cat");
        System.out.println("stack:"+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("stack:"+animals);
        System.out.println(animals.peek());
    }
    
}
