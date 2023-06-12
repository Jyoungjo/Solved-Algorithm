package com.example.baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int cardNum = Integer.parseInt(st.nextToken());
            hm.put(cardNum, hm.getOrDefault(cardNum, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int checkNum = Integer.parseInt(st.nextToken());
            if (hm.get(checkNum) != null) {
                sb.append(hm.get(checkNum) + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.print(sb);
    }
}
