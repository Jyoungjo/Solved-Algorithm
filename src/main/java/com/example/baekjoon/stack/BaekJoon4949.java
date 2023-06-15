package com.example.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon4949 {
    // 백준 4949 - 균형잡힌 세상
    public static boolean isExistBracket(String input, Stack<Character> stack) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' || c == ']') {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.pop();

                if (top != '[' && c == ']') return false;
                else if (top != '(' && c == ')') return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();

            if (input.equals(".")) break;

            if (isExistBracket(input, stack)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        System.out.print(sb);
    }
}