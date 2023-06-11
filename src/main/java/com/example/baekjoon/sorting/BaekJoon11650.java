package com.example.baekjoon.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] point = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(point, ((o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            else return o1[0] - o2[0];
        }));

        for (int i = 0; i < N; i++) {
            sb.append(String.format("%d %d", point[i][0], point[i][1])).append("\n");
        }

        System.out.println(sb);
    }
}
