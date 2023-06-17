package com.example.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon1966 {
    public static void main(String[] args) throws IOException {
        // 백준 1966 프린터 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int caseNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseNum; i++) {
            LinkedList<int[]> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.offer(new int[] { j, Integer.parseInt(st.nextToken()) });
            }

            int cnt = 0;

            while (!queue.isEmpty()) {

                int[] front = queue.poll();
                boolean isMax = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (front[1] < queue.get(j)[1]) {
                        queue.offer(front);
                        for (int k = 0; k < j; k++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if (!isMax) {
                    continue;
                }

                cnt++;

                if (front[0] == M) {
                    break;
                }
            }

            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
