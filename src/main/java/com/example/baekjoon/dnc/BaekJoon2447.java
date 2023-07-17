package com.example.baekjoon.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2447 {
    // 백준 2447 별 찍기 - 10
    char[][] starBoard;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        starBoard = new char[N][N];

        for (char[] row : starBoard) {
            Arrays.fill(row, ' ');
        }

        printStars(N, 0, 0);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(starBoard[i]).append("\n");
        }

        System.out.println(sb);
    }

    private void printStars(int size, int x, int y) {
        if (size == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) continue;
                    starBoard[x + i][y + j] = '*';
                }
            }
        }
        else {
            int dividedSize = size / 3;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) continue;
                    printStars(dividedSize, x + dividedSize * i, y + dividedSize * j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon2447().solution();
    }
}