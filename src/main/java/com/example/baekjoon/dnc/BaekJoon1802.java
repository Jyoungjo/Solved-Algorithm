package com.example.baekjoon.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1802 {
    // 백준 1802 종이 접기
    public boolean foldable(String paper) {
        if (paper.length() > 1) {
            int half = paper.length() / 2;

            if (!foldable(paper.substring(0, half))) return false;
            if (!foldable(paper.substring(half + 1))) return false;

            for (int i = 1; i < half + 1; i++) {
                if (paper.charAt(half - i) == paper.charAt(half + i)) return false;
            }
        }

        return true;
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String paper = br.readLine();
            if (foldable(paper)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new BaekJoon1802().solution();
    }
}
