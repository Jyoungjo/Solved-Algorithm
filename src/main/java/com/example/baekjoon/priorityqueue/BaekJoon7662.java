package com.example.baekjoon.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon7662 {
    // 백준 7662 이중 우선순위 큐
    PriorityQueue<Integer> maxQueue;
    PriorityQueue<Integer> minQueue;
    Map<Integer, Integer> tracker;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            int commandNum = Integer.parseInt(br.readLine());

            maxQueue = new PriorityQueue<>(Collections.reverseOrder());
            minQueue = new PriorityQueue<>();

            tracker = new HashMap<>();

            for (int j = 0; j < commandNum; j++) {
                StringTokenizer commandToken = new StringTokenizer(br.readLine());
                String command = commandToken.nextToken();
                int num = Integer.parseInt(commandToken.nextToken());

                if (command.equals("I")) {
                    maxQueue.offer(num);
                    minQueue.offer(num);
                    tracker.put(num, tracker.getOrDefault(num, 0) + 1);
                }
                else if (tracker.size() > 0 && num == 1) {
                    while (!tracker.containsKey(maxQueue.peek())) maxQueue.poll();

                    int polled = maxQueue.poll();
                    tracker.put(polled, tracker.get(polled) - 1);
                    if (tracker.get(polled) == 0) tracker.remove(polled);
                }
                else if (tracker.size() > 0 && num == -1) {
                    while (!tracker.containsKey(minQueue.peek())) minQueue.poll();

                    int polled = minQueue.poll();
                    tracker.put(polled, tracker.get(polled) - 1);
                    if (tracker.get(polled) == 0) tracker.remove(polled);
                }
            }

            if (tracker.size() == 0) answer.append("EMPTY\n");
            else {
                while (!tracker.containsKey(maxQueue.peek())) maxQueue.poll();
                while (!tracker.containsKey(minQueue.peek())) minQueue.poll();

                answer.append(maxQueue.poll()).append(" ").append(minQueue.poll()).append("\n");
            }
        }

        System.out.print(answer);
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon7662().solution();
    }
}
