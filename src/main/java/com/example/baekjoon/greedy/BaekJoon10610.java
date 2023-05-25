package com.example.baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10610 {
    // 30
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] N = new int[str.length()]; // 자릿수 만큼 배열 생성
        int sum = 0; // 합이 3의 배수인지 확인하는 변수 선언
        boolean isZero = false; // 0이 하나라도 있는지 check

        for (int i = 0; i < str.length(); i++) {
            N[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += N[i];
            if (N[i] == 0) isZero = true;
        }

        // 오름차순 정렬
        Arrays.sort(N);
        if (sum % 3 == 0 && isZero) {
            for (int i = N.length - 1; i >= 0; i--) {
                System.out.print(N[i]);
            }
        } else System.out.print(-1);
    }
}
