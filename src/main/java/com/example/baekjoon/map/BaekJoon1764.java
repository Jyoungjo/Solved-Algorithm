package com.example.baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1764 {
    // 백준 1764 듣보잡
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            set.add(name);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) list.add(name);
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
