package com.example.demo.stack.stack_10773;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] inputs = new int[N];

        for (int i=0; i<N; i++)
            inputs[i] = scanner.nextInt();

        for (int i=0; i<N; i++) {
            if (inputs[i] == 0) {
                stack.pop();
                continue;
            }

            stack.push(inputs[i]);
        }

        if(stack.isEmpty()) {
            System.out.println("0");
            return;
        }
        AtomicInteger answer = new AtomicInteger();
        stack.forEach(value -> {
            answer.addAndGet(value);
        });
        System.out.println(answer.get());
    }
}
