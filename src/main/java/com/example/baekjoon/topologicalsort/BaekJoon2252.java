package com.example.baekjoon.topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon2252 {
    // 백준 2252 줄 세우기
    List<List<Integer>> adjList;
    int students;
    StringBuilder answer;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(br.readLine());
        students = Integer.parseInt(infoToken.nextToken());
        int edges = Integer.parseInt(infoToken.nextToken());

        adjList = new ArrayList<>();

        for (int i = 0; i < students; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeToken = new StringTokenizer(br.readLine());
            int studentA = Integer.parseInt(edgeToken.nextToken());
            int studentB = Integer.parseInt(edgeToken.nextToken());

            adjList.get(studentA - 1).add(studentB - 1);
        }

        topologicalSort();

        System.out.print(answer);
    }

    public void topologicalSort() {
        int[] inDegrees = new int[students];

        for (List<Integer> neighbors : adjList) {
            for (int neighbor : neighbors) {
                inDegrees[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        answer = new StringBuilder();

        for (int i = 0; i < students; i++) {
            if (inDegrees[i] == 0) queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            answer.append(current + 1).append(" ");

            for (int neighbor : adjList.get(current)) {
                inDegrees[neighbor]--;

                if (inDegrees[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon2252().solution();
    }
}
