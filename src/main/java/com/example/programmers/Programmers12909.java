package com.example.programmers;

import java.util.Stack;

public class Programmers12909 {
    // 프로그래머스 12909 올바른 괄호
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 1. 문자가 '(' 일 때
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            // 2. 문자가 ')' 일 때
            else {
                // 2-1. 스택이 비어있다면
                if (stack.isEmpty()) {
                    return false;
                }
                // 2-2. 스택이 비어있지 않으면서 peek 했을때 '(' 이라면
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()(";

        boolean ans = new Programmers12909().solution(s);
        System.out.println(ans);
    }
}
