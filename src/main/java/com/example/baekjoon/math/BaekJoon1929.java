package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1929 {
    // 백준 1929 소수 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[N + 1]; // true -> 소수 아님 , false -> 소수

        // 숫자 0과 1은 소수가 아님
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (isPrime[i]) continue;

            for (int j = i * i; j <= N; j += i) {
                isPrime[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!isPrime[i]) sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}
