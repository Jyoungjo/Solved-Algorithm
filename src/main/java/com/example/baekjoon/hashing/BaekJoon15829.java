package com.example.baekjoon.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        String str = br.readLine();

        long answer = 0;
        long r = 1;
        int M = 1234567891;
        for (int i = 0; i < L; i++) {
            answer += ((str.charAt(i) - 'a' + 1) * r % M) % M;
            r = (r * 31) % M;
        }
        long hashValue = answer % M;
        System.out.print(hashValue);
    }
}
