package com.example.programmers;

import java.util.*;

public class Programmers42586 {
    // 프로그래머스 42586 기능개발
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                q.offer((100 - progresses[i]) / speeds[i]);
            } else {
                q.offer((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int cnt = 1;
        int target = q.poll();

        while (!q.isEmpty()) {
            if (target >= q.peek()) {
                cnt++;
                q.poll();
            } else {
                answer.add(cnt);
                cnt = 1;
                target = q.poll();
            }
        }

        answer.add(cnt);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(new Programmers42586().solution(progresses, speeds)));
    }
}
