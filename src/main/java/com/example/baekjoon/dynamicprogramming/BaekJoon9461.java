package com.example.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9461 {
    // 백준 9461 파도반 수열
    static Long[] nums = new Long[101];

    public static long dp(int n) {
        if (nums[n] == null) {
            nums[n] = dp(n - 2) + dp(n - 3);
        }

        return nums[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        nums[0] = 0L;
        nums[1] = 1L;
        nums[2] = 1L;
        nums[3] = 1L;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }
    }
}
