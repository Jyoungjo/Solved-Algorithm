package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 1;
        while (b != a) {
            if (b < a) {
                cnt = -1;
                break;
            }

            if (b % 2 == 0) {
                b /= 2;
                cnt++;
            } else if (b % 10 == 1) {
                b /= 10;
                cnt++;
            } else {
                cnt = -1;
                break;
            }
        }
        System.out.print(cnt);
    }
}
