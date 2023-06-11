package com.example.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> permutation = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            permutation.add(i + 1);
        }

        sb.append("<");
        while (permutation.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                permutation.add(permutation.poll());
            }

            sb.append(permutation.poll()).append(", ");
        }
        sb.append(permutation.poll()).append(">");

        System.out.print(sb);
    }
}
