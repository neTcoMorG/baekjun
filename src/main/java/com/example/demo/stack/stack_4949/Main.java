package com.example.demo.stack.stack_4949;


import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s;

        while (true) {
            s = scan.nextLine();
            if (s.equals("."))
                break;
            else {
                System.out.println(solve(s));
            }
        }
    }

    public static String solve (String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('.');

        for (int i=0; i<s.length(); i++) {
            if (stack.isEmpty() && s.charAt(i) == ')' && s.charAt(i) == ']') {
                return "no";
            }

            if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            }
            else if (stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            }
        }

        if (stack.size() == 1) {
            return "yes";
        }
        return "no";
    }
}
