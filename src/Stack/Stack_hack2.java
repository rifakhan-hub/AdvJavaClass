package Stack;

import java.util.*;

public class Stack_hack2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i = n-1; i >= 0; i--){

            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(arr[i]);
        }

        for(int x : res){
            System.out.print(x + " ");
        }
    }
}