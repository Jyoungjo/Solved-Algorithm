package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon11047 {
    // 동전 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coin = new int[N];
        int cnt = 0;

        // 배열에 동전의 가치 입력
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        // 개수 세는 알고리즘
        for (int i = N - 1; i >= 0; i--) {
            if (K == 0) {
                break;
            }

            if (coin[i] <= K) {
                cnt += (K / coin[i]);
                K = K % coin[i];
            }
        }
        System.out.print(cnt);
    }
}