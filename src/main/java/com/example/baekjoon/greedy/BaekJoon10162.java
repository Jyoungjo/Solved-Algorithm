package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon10162 {
    // 전자레인지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int[] button = new int[3];

        while (true) {
            if (time >= 300) {
                button[0] = time / 300;
                time %= 300;
            } else if (time >= 60) {
                button[1] = time / 60;
                time %= 60;
            } else if (time >= 10) {
                button[2] = time / 10;
                time %= 10;
            } else {
                break;
            }
        }
        if (time == 0) System.out.printf("%d %d %d", button[0], button[1], button[2]);
        else System.out.print(-1);
    }
}