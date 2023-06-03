package com.example.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int answer = 0;

        for (int i = (num - (str.length() * 9)); i < num; i++) {
            int N = i;
            int sum = 0;

            while (N != 0) {
                sum += N % 10;
                N /= 10;
            }

            if (sum + i == num) {
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
}
