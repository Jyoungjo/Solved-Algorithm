package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon1789 {
    // 수들의 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long sum = 0;
        long answer = 0;
        for (long i = 1; sum <= S; i++) {
            sum += i;
            answer++;
        }
        System.out.print(answer - 1);
    }
}