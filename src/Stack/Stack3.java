package Stack;

import java.util.Stack;

// infix to postfix
public class Stack3 {
    int precedence(char ch){
        if( ch == '^' || ch =='$' ) return 3;
        if( ch == '/' || ch == '*') return 2;
        if( ch == '+' || ch == '-') return 1;
        return -1;
    }
    String convert(String s){
        Stack<Character> st = new Stack<>();
        String result ="";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }
            else if (ch == '('){
                st.push(ch);
            }
            else if(ch ==')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result += st.pop();
                }st.pop();
            }
            else{
                while(!st.isEmpty() && precedence(st.peek())>= precedence(ch)){
                    result += st.pop();
                }st.push(ch);
            }
        }
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        Stack3 s = new Stack3();
        System.out.println(s.convert("A+B"));       // AB+
        System.out.println(s.convert("A+B*C"));     // ABC*+
        System.out.println(s.convert("A+B/(C*D)")); // ABCD*/+
        System.out.println(s.convert("(A+B/C*(D+E)-F)"));   // ABC/DE+*+F-
        System.out.println(s.convert("(A-(B+C))*D^(E+F)")); // ABC+-DEF+^*
        System.out.println(s.convert("A+B*C+(D*E+F)*G"));   // ABC*+DE*F+G*+
    }

}
