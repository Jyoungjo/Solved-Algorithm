package com.example.baekjoon.graphsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon1260 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");
        bfs(V);

        System.out.println(sb);
    }

    public static void initVisited() {
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
    }

    public static void dfs(int start) {
        sb.append(start + " ");
        visited[start] = true;

        for (int i = 1; i < visited.length; i++) {
            if (i != start && !visited[i] && graph[start][i] == 1) dfs(i);
        }
    }

    public static void bfs(int start) {
        initVisited();
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int num = q.poll();
            sb.append(num + " ");

            for (int i = 1; i < visited.length; i++) {
                if (i != num && !visited[i] && graph[num][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        sb.append("\n");
    }
}