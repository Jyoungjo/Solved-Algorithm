package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // A만큼 간다면, 무조건 하루가 더 걸린다
        int result = 1;

        // 며칠 걸리는지?
        if ((V - A) % (A - B) == 0) {
            result += (V - A) / (A - B);
        } else {
            result += (V - A) / (A - B) + 1;
        }
        System.out.print(result);
    }
}
