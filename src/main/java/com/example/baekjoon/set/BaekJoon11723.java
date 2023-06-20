package com.example.baekjoon.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon11723 {
    // 백준 11723 집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> set = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "add": {
                    int x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) break;
                    else set.add(x);
                    break;
                }
                case "remove": {
                    int x = Integer.parseInt(st.nextToken());
                    if (!set.contains(x)) break;
                    else set.remove(set.indexOf(x));
                    break;
                }
                case "check": {
                    int x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                }
                case "toggle": {
                    int x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) set.remove(set.indexOf(x));
                    else set.add(x);
                    break;
                }
                case "all": {
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                }
                case "empty": {
                    set.clear();
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
