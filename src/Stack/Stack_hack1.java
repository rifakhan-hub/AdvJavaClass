package Stack;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Stack_hack1 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        String[] splited = str.split(" ");

        Stack<String> st = new Stack<>();


        for (int i = 0; i < splited.length; i++) {
            if (!splited[i].equals("-")) {
                st.push(splited[i]);
            }else if(splited[i].equals("-")) {

                if (!st.isEmpty())
                    st.pop();

            }
        }
        if (st.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (String x : st) {
                System.out.print(x + " ");
            }
        }
    }
}

