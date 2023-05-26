package com.example.baekjoon.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon1715 {
    public static void main(String[] args) {
        // 카드 정렬하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextLong());
        }

        long answer = 0;
        // N = 1이면 비교 X
        while (pq.size() > 1) {
            long num1 = pq.poll();
            long num2 = pq.poll();

            answer += num1 + num2;
            pq.add(num1 + num2); //합한 묶음 다시 넣기
        }

        System.out.println(answer);

    }
}
