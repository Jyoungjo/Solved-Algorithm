package com.example.programmers;

import java.util.PriorityQueue;

public class Programmers42626 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> mixScoville = new PriorityQueue<>();
        int answer = 0;

        for (int num : scoville) {
            mixScoville.add(num);
        }

        while (mixScoville.peek() < K) {
            if (mixScoville.size() == 1) {
                return -1;
            }
            mixScoville.add(mixScoville.poll() + (mixScoville.poll() * 2));
            answer++;
        }

        return answer;
    }
}
