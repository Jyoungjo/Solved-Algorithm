package com.example.baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon9375 {
    // 백준 9375 패션왕 신해빈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String clothType = st.nextToken();

                map.put(clothType, map.getOrDefault(clothType, 0) + 1);
            }

            int answer = 1;
            for (int val : map.values()) {
                answer *= val + 1;
            }

            System.out.println(answer - 1);
        }
    }
}
