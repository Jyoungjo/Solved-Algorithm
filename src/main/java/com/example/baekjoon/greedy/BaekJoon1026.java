package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int maxValue = B[0];
            int minValue = A[0];
            int idxA = 0;
            int idxB = 0;
            for (int j = 1; j < N; j++) {
                if (maxValue < B[j]) {
                    maxValue = B[j];
                    idxB = j;
                }
                if (minValue > A[j]) {
                    minValue = A[j];
                    idxA = j;
                }
            }
            answer += A[idxA] * B[idxB];
            A[idxA] = 101;
            B[idxB] = -1;
        }
        System.out.println(answer);
    }
}
