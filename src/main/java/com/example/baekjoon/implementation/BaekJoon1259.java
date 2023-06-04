package com.example.baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            int strLength = str.length();
            int cnt = 0;
            for (int i = 0; i < strLength / 2; i++) {
                if (str.charAt(i) == str.charAt(strLength - i - 1)) {
                    cnt++;
                }
            }
            if (cnt == strLength / 2) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
