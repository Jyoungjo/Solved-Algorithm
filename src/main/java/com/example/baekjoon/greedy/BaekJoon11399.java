package com.example.baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11399 {
    // ATM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfPerson = sc.nextInt();

        // 한 사람이 인출하는데 기다려야 하는 시간 배열 선언
        int[] waitingTimeOfPerson = new int[numOfPerson];

        // 한 사람당 인출하는데 걸리는 시간
        int[] tradeTimeOfPerson = new int[numOfPerson];
        for (int i = 0; i < numOfPerson; i++) {
            tradeTimeOfPerson[i] = sc.nextInt();
        }

        // 인출하는데 걸리는 시간을 오름차순 정렬
        Arrays.sort(tradeTimeOfPerson);

        int sumOfTime = tradeTimeOfPerson[0];
        waitingTimeOfPerson[0] = tradeTimeOfPerson[0];

        // 사람 당 기다려야 하는 시간을 구하는 점화식
        for (int i = 1; i < numOfPerson; i++) {
            waitingTimeOfPerson[i] = waitingTimeOfPerson[i - 1] + tradeTimeOfPerson[i];
            sumOfTime += waitingTimeOfPerson[i];
        }
        System.out.print(sumOfTime);
    }
}