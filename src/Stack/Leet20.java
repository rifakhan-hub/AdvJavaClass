package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Leet20 {
    public static void main(String[] args) {

        Leet20 l = new Leet20();
        //l.isValid("({})");
        if (l.isValid("()")){
            System.out.println("String acceptedd!");
        }else System.out.println("string Invalid!!");
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='('|| ch=='{' || ch=='['){
                st.push(ch);
            }
            char temp = st.peek();

            if(ch == ')' && temp != '(' || ch == '}' && temp != '{' || ch == ']' && temp != '[' ){
                return false;
            }
            if(ch == ')' && temp == '(' || ch == '}' && temp == '{' || ch == ']' && temp == '[' ){
                st.pop();
            }if(st.peek() != -1){
                return false;
            }
        }
        return true;
    }
}
