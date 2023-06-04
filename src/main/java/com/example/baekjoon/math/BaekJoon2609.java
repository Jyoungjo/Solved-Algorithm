package com.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        if (numA < numB) {
            int temp = numA;
            numA = numB;
            numB = temp;
        }

        int multipleNum = numA * numB;

        int gcd = 0;
        int lcm = 0;
        while (numB != 0) {
            int remainder = numA % numB;
            numA = numB;
            numB = remainder;

            gcd = numA;
        }

        lcm = multipleNum / gcd;

        System.out.printf("%d %d", gcd, lcm);
    }
}
