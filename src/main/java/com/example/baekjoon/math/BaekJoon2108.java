package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2108 {
    // 백준 2108 통계학
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 1. 산술평균
        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum += nums[i];
        }
        sb.append(Math.round(sum / N)).append("\n");

        // 2. 중앙값
        Arrays.sort(nums);

        sb.append(nums[(N - 1) / 2]).append("\n");

        // 3. 최빈값
        int count = 0;
        int cntMax = -1;
        int mod = nums[0];

        boolean check = false;

        for(int i = 0; i < N - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if (cntMax < count) {
                cntMax = count;
                mod = nums[i];
                check = true;
            } else if (cntMax == count && check) {
                mod = nums[i];
                check = false;
            }
        }
        sb.append(mod).append("\n");

        // 4. 범위
        sb.append(nums[N - 1] - nums[0]).append("\n");

        System.out.print(sb);
    }
}