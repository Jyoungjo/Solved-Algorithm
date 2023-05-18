package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon1541 {
    // 잃어버린 괄호
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // "-" 기준으로 split
        String[] sArr = sc.nextLine().split("-");

        int answer = 0;
        for (int i = 0; i < sArr.length; i++) {
            // 분리된 배열 중 "+" 기준으로 split
            String[] subStr = sArr[i].split("\\+");

            int calc = 0;
            for (String str : subStr) {
                // "+" 끼리 먼저 계산
                calc += Integer.parseInt(str);
            }

            // 첫 숫자는 더해주고 나머지는 뺀다.
            if (i == 0) answer += calc;
            else answer -= calc;
        }
        System.out.print(answer);
    }
}
