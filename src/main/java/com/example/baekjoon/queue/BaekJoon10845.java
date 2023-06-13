package com.example.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];

        StringBuilder sb = new StringBuilder();

        int idx = -1;
        int size = 0;
        int left = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                arr[++idx] = input;
                size++;
            } else if (str.equals("pop")) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(arr[left++]).append("\n");
                    size--;
                }
            } else if (str.equals("size")) {
                sb.append(size).append("\n");
            } else if (str.equals("empty")) {
                sb.append(size == 0 ? 1 : 0).append("\n");
            } else if (str.equals("front")) {
                if (size == 0) sb.append(-1).append("\n");
                else sb.append(arr[left]).append("\n");
            } else {
                if (size == 0) sb.append(-1).append("\n");
                else sb.append(arr[idx]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
