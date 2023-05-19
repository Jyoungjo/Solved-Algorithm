package com.example.baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] iArr = new int[N];

        for (int i = 0; i < N; i++) {
            iArr[i] = sc.nextInt();
        }

        // 배열 오름차순 정렬
        Arrays.sort(iArr);
        int maxValue = iArr[0];

        // 최대 중량 = iArr[i] * (N - i)
        for (int i = 0; i < N; i++) {
            if (maxValue < iArr[i] * (N - i)) {
                maxValue = iArr[i] * (N - i);
            }
        }
        System.out.println(maxValue);
    }
}
