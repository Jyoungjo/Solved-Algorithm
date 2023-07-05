package com.example.programmers;

public class Programmers43165 {
    // 프로그래머스 타겟 넘버
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int next, int target, int sum) {
        if (next == numbers.length) {
            if (sum == target) {
                this.answer++;
            }
        } else {
            dfs(numbers, next + 1, target, sum + numbers[next]);
            dfs(numbers, next + 1, target, sum - numbers[next]);
        }
    }

    public static void main(String[] args) {
        int answer = new Programmers43165().solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(answer);
    }
}
