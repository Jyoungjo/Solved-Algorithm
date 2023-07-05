package com.example.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers43162 {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(n, computers, visited, i);
                answer++;
            }
        }

        return answer;
    }

    public void bfs(int n, int[][] computers, boolean[] visited, int computer) {
        Queue<Integer> toVisit = new LinkedList<>();
        toVisit.offer(computer);
        visited[computer] = true;

        while (!toVisit.isEmpty()) {
            int next = toVisit.poll();

            for (int i = 0; i < n; i++) {
                if (!visited[i] && computers[next][i] == 1) {
                    toVisit.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int answer = new Programmers43162().solution(3, new int[][]{
                {1, 1, 0}, {1, 1, 1}, {0, 1, 1}
        });

        System.out.println(answer);
    }
}
