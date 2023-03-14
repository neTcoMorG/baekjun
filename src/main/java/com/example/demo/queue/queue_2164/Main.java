package com.example.demo.queue.queue_2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i=0; i<N; i++) {
            que.add(i+1);
        }

        while(que.size() > 1) {
            que.poll();
            int top = que.poll();
            que.add(top);
        }

        System.out.println(que.poll());
    }
}
