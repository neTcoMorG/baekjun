package com.example.demo.stack.stack_9012;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt() + 1;

        String[] array = new String[N];
        for (int i=0; i<N; i++) {
            array[i] = scan.nextLine();
        }

        for (int i=1; i<N; i++) {
            char[] chars = array[i].toCharArray();
            for (int j=0; j<chars.length; j++) {
                if (stack.isEmpty() && chars[j] == ')') {
                    stack.push(')');
                    break;
                }
                if (chars[j] == '(') {
                    stack.push('(');
                }
                else { stack.pop(); }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
