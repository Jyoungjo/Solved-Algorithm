package com.example.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BaekJoon15903 {
    // 백준 15903 카드 합체 놀이
    int[] cards;

    public long combine(int cardNums, int count) {
        long answer = 0;
        PriorityQueue<Long> combinePq = new PriorityQueue<>();

        for (int i = 0; i < cardNums; i++) {
            combinePq.offer((long) cards[i]);
        }

        for (int i = 0; i < count; i++) {
            long sum = combinePq.poll() + combinePq.poll();

            for (int j = 0; j < 2; j++) {
                combinePq.offer(sum);
            }
        }

        while (!combinePq.isEmpty()) {
            answer += combinePq.poll();
        }

        return answer;
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(br.readLine());
        int cardNums = Integer.parseInt(infoToken.nextToken());
        int combineCount = Integer.parseInt(infoToken.nextToken());

        cards = new int[cardNums];
        StringTokenizer cardToken = new StringTokenizer(br.readLine());

        for (int i = 0; i < cardNums; i++) {
            cards[i] = Integer.parseInt(cardToken.nextToken());
        }

        System.out.print(combine(cardNums, combineCount));
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon15903().solution();
    }
}
