package com.example.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers12906 {
    public int[] solution(int[] arr) {
        int[] answer;

        Queue<Integer> queue = new LinkedList<>();

        // 첫번째 숫자는 무조건 넣는다.
        queue.offer(arr[0]);

        // 두 번째 숫자부터 비교하기 시작
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                queue.offer(arr[i]);
            }
        }

        answer = new int[queue.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,4,4,3,3};

        int[] ans = new Programmers12906().solution(arr);

        for (int a : ans) {
            System.out.println(a);
        }
    }
}
