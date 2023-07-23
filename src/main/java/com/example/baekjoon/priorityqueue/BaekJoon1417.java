package com.example.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon1417 {
    // 백준 1417 국회의원 선거
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int candidateNum = Integer.parseInt(br.readLine());
        int myVote = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> otherVotes = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < candidateNum - 1; i++) {
            otherVotes.offer(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;

        if (!otherVotes.isEmpty()) {
            while (otherVotes.peek() >= myVote) {
                otherVotes.offer(otherVotes.poll() - 1);
                myVote++;
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        System.out.print(new BaekJoon1417().solution());
    }
}
