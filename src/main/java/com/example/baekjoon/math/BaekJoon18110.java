package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon18110 {
    // 백준 18110 solved.ac
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int exNum = (int) Math.round(N * 0.15);
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        double sum = 0;
        for (int i = exNum; i < N - exNum; i++) {
            sum += arr[i];
        }

        System.out.print(Math.round(sum / (N - exNum * 2)));
    }
}
