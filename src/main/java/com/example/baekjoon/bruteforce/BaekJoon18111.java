package com.example.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon18111 {
    // 백준 18111 마인크래프트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] field = new int[N][M];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, field[i][j]);
                min = Math.min(min, field[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;

        for (int i = min; i <= max; i++) {
            int time = 0;
            int inventory = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int target = field[j][k];

                    if (target == i) continue;

                    if (target > i) {
                        time += (target - i) * 2;
                        inventory += target - i;
                    }
                    else {
                        time += (i - target);
                        inventory -= (i - target);
                    }
                }
            }

            if (inventory >= 0 && minTime >= time) {
                height = i;
                minTime = time;
            }
        }

        System.out.printf("%d %d", minTime, height);
    }
}
