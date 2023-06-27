package com.example.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2579 {
    // 백준 2579 계단 오르기
    static Integer[] score;
    static int[] stair;

    public static int solution(int n) {
        if (score[n] == null) {
            score[n] = Math.max(solution(n - 2), solution(n - 3) + stair[n - 1]) + stair[n];
        }

        return score[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairNum = Integer.parseInt(br.readLine());
        stair = new int[stairNum + 1];
        score = new Integer[stairNum + 1];

        for (int i = 1; i <= stairNum; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        score[0] = stair[0];
        score[1] = stair[1];

        if (stairNum >= 2) {
            score[2] = stair[1] + stair[2];
        }

        System.out.print(solution(stairNum));
    }
}