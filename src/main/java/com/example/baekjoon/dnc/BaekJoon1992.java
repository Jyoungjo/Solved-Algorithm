package com.example.baekjoon.dnc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1992 {
    // 백준 1992 쿼드트리
    private char[][] images;
    public StringBuilder quadTreeBuilder;

    public void compress(int n, int x, int y) {
        boolean check = true;
        char init = images[x][y];

        // 완전 탐색 진행 -> 첫번째 이미지와 하나라도 다르다면 즉시 멈추고 4등분 진행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (images[x + i][y + j] != init) {
                    check = false;
                    break;
                }
            }
            // 반복 중지
            if (!check) break;
        }

        // 다른 숫자 하나라도 발견됐으므로 4등분해서 각 사분면 다시 확인
        if (!check) {
            quadTreeBuilder.append('(');
            int half = n / 2;

            // 반복문을 통한 사분면 생성
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    compress(half, x + half * i, y + half * j);
                }
            }

//            // 1사분면
//            compress(half, x, y);
//            // 2사분면
//            compress(half, x, y + half);
//            // 3사분면
//            compress(half, x + half, y);
//            // 4사분면
//            compress(half, x + half, y + half);

            quadTreeBuilder.append(')');
        }
        else {
            // 사분면에 숫자가 모두 일치한다면 해당 숫자 출력
            quadTreeBuilder.append(init);
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        images = new char[n][];

        for (int i = 0; i < n; i++) {
            images[i] = br.readLine().toCharArray();
        }

        quadTreeBuilder = new StringBuilder();
        compress(n, 0, 0);
        System.out.print(quadTreeBuilder);
    }

    public static void main(String[] args) throws IOException{
        new BaekJoon1992().solution();
    }
}
