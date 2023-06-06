package com.example.baekjoon.sorting;

import java.io.*;
import java.util.Arrays;

public class BaekJoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] sArr = new String[N];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = br.readLine();
        }

        Arrays.sort(sArr, ((o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            else return o1.length() - o2.length();
        }));

        StringBuilder sb = new StringBuilder();

        sb.append(sArr[0]).append("\n");
        for (int i = 1; i < sArr.length; i++) {
            if (!sArr[i].equals(sArr[i - 1])) {
                sb.append(sArr[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
}