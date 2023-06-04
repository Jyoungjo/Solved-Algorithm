package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 2;

        while (range <= N) {
            if (N == 1) break;

            range = range + 6 * cnt;
            cnt++;
        }
        System.out.print(cnt);
    }
}