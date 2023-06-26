package com.example.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1003 {
    // 백준 1003 피보나치 함수
    public static Integer[][] arr = new Integer[41][2];

    public static Integer[] fibonacci(int N) {
        if (arr[N][0] == null || arr[N][1] == null) {
            arr[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            arr[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        return arr[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        arr[0][0] = 1; // N = 0일 때, 0이 출력된 개수
        arr[0][1] = 0; // N = 0일 때, 1이 출력된 개수
        arr[1][0] = 0; // N = 1일 때, 0이 출력된 개수
        arr[1][1] = 1; // N = 1일 때, 1이 출력된 개수

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            fibonacci(N);

            sb.append(arr[N][0] + " " + arr[N][1]).append("\n");
        }

        System.out.print(sb);
    }
}