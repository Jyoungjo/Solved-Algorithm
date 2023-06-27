package com.example.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1463 {
    // 백준 1463 1로 만들기

    static Integer[] arr;

    static int solution(int n) {
        if (arr[n] == null) {
            if (n % 6 == 0) {
                arr[n] = Math.min(Math.min(solution(n / 2), solution(n / 3)), solution(n - 1)) + 1;
            } else if (n % 3 == 0) {
                arr[n] = Math.min(solution(n / 3), solution(n - 1)) + 1;
            } else if (n % 2 == 0) {
                arr[n] = Math.min(solution(n / 2), solution(n - 1)) + 1;
            } else {
                arr[n] = solution(n - 1) + 1;
            }
        }
        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new Integer[n + 1];
        arr[0] = arr[1] = 0;

        System.out.print(solution(n));
    }
}
