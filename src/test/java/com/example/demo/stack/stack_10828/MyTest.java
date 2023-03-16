package com.example.demo.stack.stack_10828;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MyTest {


    @Test
    void heap_test () {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] map = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                int value = scanner.nextInt();
                map[i][j] = value;
                que.add(value);
            }
        }

        int answer = 0;
        int cnt = 0;
        while(!que.isEmpty()) {
            answer = que.poll();
            cnt++;
            if (cnt == N) {
                break;
            }
        }

        System.out.println(answer);
    }
}
