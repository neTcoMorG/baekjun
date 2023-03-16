package com.example.demo.queue.queue_2164;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Jewel> jewel = new PriorityQueue<>();
        PriorityQueue<Integer> bags = new PriorityQueue<>(Collections.reverseOrder());
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 총 보석 개수
        int K = scanner.nextInt(); // 가방 개수

        for (int i=0; i<N; i++) {
            int M = scanner.nextInt(); //보석 무게
            int V = scanner.nextInt(); // 보석 가치
            jewel.add(new Jewel(M, V));
        }
        for (int i=0; i<K; i++) {
            bags.add(scanner.nextInt());
        }

        int answer = 0;
        int total = 0;

        while(!bags.isEmpty()) {
            int limit = bags.poll(); // 가방의 최대 허용치

            if (jewel.isEmpty()) { break; }
            while (!jewel.isEmpty()) {
                Jewel j = jewel.peek();
                if (limit <= (total+j.getWeight())) {
                    answer += j.getValue();
                    jewel.poll();
                    continue;
                }
                break;
            }
            total = 0;
        }

        System.out.println(answer);
    }

    static class Jewel implements Comparable<Jewel> {
        private int weight;
        private int value;

        public Jewel (int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        @Override
        public int compareTo(Jewel o) {
            return this.value <= o.value ? 1 : -1;
        }
        public int getWeight() {return weight;}
        public int getValue() {return value;}
    }
}
