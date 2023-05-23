package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon13305 {
    // 주유소
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCity = sc.nextInt();
        int[] road = new int[numOfCity - 1];
        int[] oil = new int[numOfCity];

        for (int i = 0; i < road.length; i++) {
            road[i] = sc.nextInt();
        }
        for (int i = 0; i < oil.length; i++) {
            oil[i] = sc.nextInt();
        }

        int minOil = oil[0];
        long answer = 0;
        for (int i = 0; i < road.length; i++) {
            if (oil[i] < minOil) minOil = oil[i];
            answer += (long) minOil * road[i];
        }
        System.out.print(answer);
    }
}