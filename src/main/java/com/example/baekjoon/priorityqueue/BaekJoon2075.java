package com.example.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BaekJoon2075 {
    // 백준 2075 N번째 큰 수
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            StringTokenizer numsToken = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                pq.offer(Integer.parseInt(numsToken.nextToken()));
            }
        }

        for (int i = 0; i < N - 1; i++) {
            pq.poll();
        }

        System.out.print(pq.poll());
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon2075().solution();
    }
}
