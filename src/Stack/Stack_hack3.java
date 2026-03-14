// need to have an optimized version for the code

package Stack;

import java.util.Scanner;

public class Stack_hack3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        Stack_hack3 h3 = new Stack_hack3();
        h3.brute(heights, n);

    }

    void brute(int[] heights, int n) {
        int temp = 0;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (heights[i] <= heights[j]) {
                    area = heights[i] * (j - i);
                } else {
                    area = heights[j] * (j - i);
                }
                if (temp < area) temp = area;
            }
        }
        System.out.println(temp);
    }
    void optimal(int[] heights, int n){

    }

}
