package com.example.baekjoon.greedy;

import java.util.Scanner;

public class BaekJoon5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = 1000 - sc.nextInt();
        int answer = 0;

        while (change != 0) {
            if (change / 500 != 0) {
                answer += change / 500;
                change = change % 500;
            } else if (change / 100 != 0) {
                answer += change / 100;
                change = change % 100;
            } else if (change / 50 != 0) {
                answer += change / 50;
                change = change % 50;
            } else if (change / 10 != 0) {
                answer += change / 10;
                change = change % 10;
            } else if (change / 5 != 0) {
                answer += change / 5;
                change = change % 5;
            } else {
                answer += change;
                change = 0;
            }
        }
        System.out.print(answer);
    }
}
