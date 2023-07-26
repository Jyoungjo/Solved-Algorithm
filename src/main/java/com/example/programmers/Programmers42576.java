package com.example.programmers;

import java.util.HashMap;

class Programmers42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> comp = new HashMap<>();

        for (String player : participant) {
            comp.put(player, comp.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            comp.put(player, comp.get(player) - 1);
        }

        for (String key : comp.keySet()) {
            if (comp.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
