package com.example.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10773 {
    // 백준 10773 제로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input != 0) {
                sum += stack.push(input);
            } else {
                sum -= stack.pop();
            }
        }

        System.out.print(sum);
    }
}
