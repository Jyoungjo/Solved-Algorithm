package com.example.baekjoon.greedy;

import java.util.*;

import java.util.Scanner;

class Grade implements Comparable<Grade> {
    int a;
    int b;

    public Grade(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Grade o) {
        if (this.a > o.a) return 1;
        else return -1;
    }
}

public class BaekJoon1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int numOfVolunteer = sc.nextInt();
            ArrayList<Grade> list = new ArrayList<>();

            for (int j = 0; j < numOfVolunteer; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(new Grade(a, b));
            }

            Collections.sort(list);

            int answer = 1;
            int min = list.get(0).b;

            for (int j = 1; j < numOfVolunteer; j++) {
                if (list.get(j).b < min) {
                    answer++;
                    min = list.get(j).b;
                }
            }
            System.out.println(answer);
        }
    }
}

/* 다른 풀이 - 값을 index로 이용하는 방법
public class BaekJoon1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {

            int numOfVolunteer = sc.nextInt();
            int[] grade = new int[numOfVolunteer + 1];

            for (int j = 0; j < numOfVolunteer; j++) {
                int idx = sc.nextInt();
                int val = sc.nextInt();
                grade[idx] = val;
            }

            int answer = 1;
            int min = grade[1];

            for (int j = 2; j <= numOfVolunteer; j++) {
                if (grade[j] < min) {
                    answer++;
                    min = grade[j];
                }
            }
            System.out.println(answer);
        }
    }
}
 */