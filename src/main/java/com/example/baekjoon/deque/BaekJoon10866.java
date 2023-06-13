package com.example.baekjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push_front": {
                    int input = Integer.parseInt(st.nextToken());
                    list.add(0, input);
                    break;
                }
                case "push_back" : {
                    int input = Integer.parseInt(st.nextToken());
                    list.add(input);
                    break;
                }
                case "pop_front" : {
                    if (list.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(list.get(0)).append("\n");
                        list.remove(0);
                    }
                    break;
                }
                case "pop_back" : {
                    if (list.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(list.get(list.size() - 1)).append("\n");
                        list.remove(list.size() - 1);
                    }
                    break;
                }
                case "size" : {
                    sb.append(list.size()).append("\n");
                    break;
                }
                case "empty" : {
                    sb.append(list.size() == 0 ? 1 : 0).append("\n");
                    break;
                }
                case "front" : {
                    if (list.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(list.get(0)).append("\n");
                    }
                    break;
                }
                case "back" : {
                    if (list.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(list.get(list.size() - 1)).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
