package com.example.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BaekJoon11000 {
    // 백준 11000 강의실 배정
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<int[]> lectureQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < N; i++) {
            StringTokenizer lectureToken = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(lectureToken.nextToken());
            int end = Integer.parseInt(lectureToken.nextToken());

            lectureQueue.offer(new int[]{start, end});
        }

        PriorityQueue<Integer> roomQueue = new PriorityQueue<>();

        while (!lectureQueue.isEmpty()) {
            int[] times = lectureQueue.poll();

            if (!roomQueue.isEmpty() && roomQueue.peek() <= times[0]) {
                roomQueue.poll();
            }

            roomQueue.offer(times[1]);
        }

        return roomQueue.size();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(new BaekJoon11000().solution());
    }
}
