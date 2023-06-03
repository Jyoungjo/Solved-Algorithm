package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double[] arr = new double[3];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(st.nextToken());
            }

            Arrays.sort(arr);

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) != Math.pow(arr[2], 2)) {
                System.out.println("wrong");
            } else {
                System.out.println("right");
            }
        }
    }
}