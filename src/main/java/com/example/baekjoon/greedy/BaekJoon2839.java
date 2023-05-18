package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon2839 {
    // 설탕 배달
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightOfSugar = sc.nextInt();

        if (weightOfSugar == 4 || weightOfSugar == 7) {
            System.out.print(-1);
        } else if (weightOfSugar % 5 == 1 || weightOfSugar % 5 == 3) {
            System.out.print(weightOfSugar / 5 + 1);
        } else if (weightOfSugar % 5 == 0) {
            System.out.print(weightOfSugar / 5);
        } else if (weightOfSugar % 5 == 2 || weightOfSugar % 5 == 4) {
            System.out.print(weightOfSugar / 5 + 2);
        }
    }
}
