package Stack;
// print stack statement
//traditional approach of stack

public class Stack1 {

    int top;
    int maxEle;
    int[] st;

    Stack1(int maxEle){
        st = new int[maxEle];
        this.maxEle = maxEle;   // initializing instance var by a local var
        top =-1;

    }

    public static void main(String[] args) {
        Stack1 s1 = new Stack1(5);
        s1.push(10);
        s1.push(20);
        s1.pop();
    }
    void push(int val){
        if (top == maxEle-1){
            System.out.println("full/overflow");
        }
        else{
            top ++;
            st[top] = val;
            System.out.println();
        }
    }

    int pop(){
        if (top==-1) {
            System.out.println("stack is empty");
            return -100;
        }
        return st[top--];
    }

    int peek(){
        if (top==-1) {
            System.out.println("stack is empty");
            return -100;
        }
        return st[top];
    }
}
