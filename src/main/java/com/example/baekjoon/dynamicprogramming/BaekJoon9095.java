package com.example.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9095 {
    // 백준 9095 1, 2, 3 더하기
    static Integer[] cnt = new Integer[11];

    public static int dp(int n) {
        if (cnt[n] == null) {
            cnt[n] = dp(n - 1) + dp(n - 2) + dp(n - 3);
        }

        return cnt[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            cnt[0] = 0;
            cnt[1] = 1;
            cnt[2] = 2;
            cnt[3] = 4;

            System.out.println(dp(n));
        }
    }
}
