package com.example.baekjoon.graphsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon2606 {
    // 백준 2606 바이러스
    public static int bfs(int start, int[][] linkedCom, boolean[] visited) {
        int answer = 0;
        Queue<Integer> toVisit = new LinkedList<>();
        toVisit.offer(start);
        visited[start] = true;

        while (toVisit.size() != 0) {
            int next = toVisit.poll();

            for (int i = 1; i < visited.length; i++) {
                if (i != next && !visited[i] && linkedCom[next][i] == 1) {
                    toVisit.offer(i);
                    visited[i] = true;
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computersNum = Integer.parseInt(br.readLine());
        int connectedCom = Integer.parseInt(br.readLine());

        int[][] linkedCom = new int[computersNum + 1][computersNum + 1];

        boolean[] visited = new boolean[computersNum + 1];

        StringTokenizer st;
        for (int i = 0; i < connectedCom; i++) {
            st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());
            linkedCom[com1][com2] = 1;
            linkedCom[com2][com1] = 1;
        }

        int count = bfs(1, linkedCom, visited);

        System.out.print(count);
    }
}
