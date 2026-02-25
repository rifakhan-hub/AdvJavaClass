package Stack;
import java.util.Arrays;
import java.util.Stack;
 // generic class in java is the template(in c++)


public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.pop();

        // print olleH by using Stack

        String s = "Hello";
        char[] str = s.toCharArray();
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(str[i]);
        }


        Stack<String> a = new Stack<>();
        for (int i=0; i<str.length; i++ ){
            a.push(String.valueOf(str[i]));
        }

    }
}

