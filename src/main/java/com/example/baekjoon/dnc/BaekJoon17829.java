package com.example.baekjoon.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon17829 {
    // 백준 17829번 222-풀링
    int[][] matrix;

    public int pooling(int n, int x, int y) {
        if (n == 2) {
            int[] four = new int[]{
                    matrix[x][y],
                    matrix[x][y + 1],
                    matrix[x + 1][y],
                    matrix[x + 1][y + 1],
            };
            Arrays.sort(four);

            return four[2];
        } else {
            int half = n / 2;
            int[] four = new int[]{
                    pooling(half, x, y),
                    pooling(half, x, y + half),
                    pooling(half, x + half, y),
                    pooling(half, x + half, y + half),
            };
            Arrays.sort(four);

            return four[2];
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.print(pooling(N, 0, 0));
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon17829().solution();
    }
}
