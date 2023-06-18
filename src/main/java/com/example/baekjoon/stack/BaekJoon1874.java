package com.example.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1874 {
    // 백준 1874 스택 수열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int num = 0;

        while (N-- > 0) {
            int input = Integer.parseInt(br.readLine());

            if (input > num) {
                for (int i = num + 1; i <= input; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                num = input;
            } else if (stack.peek() != input) {
                System.out.print("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.print(sb);
    }
}