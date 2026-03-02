package Stack;
import java.util.Arrays;
import java.util.Stack;
 // generic class in java is the template(in c++)


public class Stack2 {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.pop();

        // print olleH by using Stack


//        char[] str = s.toCharArray();
//        for (int i = 0; i < stack.size(); i++) {
//            System.out.println(str[i]);
//        }

        String s = "Hello";
        Stack<Character> a = new Stack<>();
        for (int i=0; i<s.length(); i++ ){
            a.push((s.charAt(i)));
            System.out.print(a.peek()+" ");

        }System.out.println();
        while(!a.isEmpty()) {
            System.out.print(a.pop()+" ");
        }
    }
}

