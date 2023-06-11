package com.example.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> cardDeck = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            cardDeck.add(i);
        }

        while (cardDeck.size() > 1) {
            cardDeck.poll();
            if (cardDeck.size() != 1) cardDeck.add(cardDeck.poll());
        }

        System.out.print(cardDeck.peek());
    }
}
