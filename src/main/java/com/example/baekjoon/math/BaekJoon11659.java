package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11659 {
    // 백준 11659 구간 합 구하기 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] prefixSum = new int[N + 1];

        StringTokenizer numsToken = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            prefixSum[i + 1] = prefixSum[i] + Integer.parseInt(numsToken.nextToken());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer rangeToken = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(rangeToken.nextToken());
            int end = Integer.parseInt(rangeToken.nextToken());

            System.out.println(prefixSum[end] - prefixSum[start - 1]);
        }
    }
}
