package com.example.baekjoon.sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> iArr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            iArr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(iArr);

        for (int i = 0; i < N; i++) {
            bw.append(String.valueOf(iArr.get(i)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}