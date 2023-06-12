package com.example.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[100001];
        int top = -1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "top" : {
                    if (top == -1) sb.append(top).append("\n");
                    else sb.append(arr[top]).append("\n");
                    break;
                }

                case "pop" : {
                    if (top == -1) sb.append(top).append("\n");
                    else sb.append(arr[top--]).append("\n");
                    break;
                }

                case "size" : {
                    sb.append(top + 1).append("\n");
                    break;
                }

                case "empty" : {
                    sb.append(top == -1 ? 1 : 0).append("\n");
                    break;
                }

                default : {
                    int n = Integer.parseInt(st.nextToken());
                    arr[++top] = n;
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}