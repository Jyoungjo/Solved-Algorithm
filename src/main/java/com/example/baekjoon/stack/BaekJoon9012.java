package com.example.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if (stack.empty()) {
                    stack.push('-');
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.empty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

            System.out.print(sb);
        }
    }
}
