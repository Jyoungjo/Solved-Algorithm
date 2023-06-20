package com.example.baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1620 {
    // 백준 1620 나는야 포켓몬 마스터 이다솜
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pokemonNum = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        for (int i = 1; i <= pokemonNum; i++) {
            String pokemonName = br.readLine();
            String idx = Integer.toString(i);
            map.put(idx, pokemonName);
            map.put(pokemonName, idx);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < quizNum; i++) {
            String str = br.readLine();
            sb.append(map.get(str)).append("\n");
        }
        System.out.print(sb);
    }
}
