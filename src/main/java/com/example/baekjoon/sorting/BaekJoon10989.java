package com.example.baekjoon.sorting;

import java.io.*;

public class BaekJoon10989 {
    public static void main(String[] args) throws IOException {
        // 계수정렬 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] cnt = new int[10001];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int num : arr) {
            cnt[num]++;
        }

        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }

    /*
    // 퀵 정렬 사용

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arr);

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(arr[i])+ "\n");
        }
        bw.flush();
        bw.close();
    }
     */
}
