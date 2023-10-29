package com.example.programmers;

import java.util.*;

public class Programmers42579 {
    // 프로그래머스 42579 베스트앨범
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        // 장르의 총 재생 횟수를 카운트 하는 Map
        Map<String, Integer> countMap = new HashMap<>();
        // 장르별 (인덱스와 재생횟수)를 담은 Map
        Map<String, Map<Integer, Integer>> music = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            // countMap 에 해당 장르가 존재하지 않는다면
            if (!countMap.containsKey(genres[i])) {
                // 인덱스와 재생횟수를 담을 map 생성
                Map<Integer, Integer> map = new HashMap<>();
                // 인덱스, 재생횟수 입력
                map.put(i, plays[i]);
                // 해당 map 을 value, genre 를 key 로 하는 데이터 입력
                music.put(genres[i], map);
                // countMap 에 장르별 총 재생횟수 입력
                countMap.put(genres[i], plays[i]);
            } else {
                // 이미 key 가 등록 되어 있으므로 해당 key 를 통해 꺼낸 map 에 인덱스와 재생횟수 입력
                music.get(genres[i]).put(i, plays[i]);
                // 해당 장르의 값을 꺼내서 재생횟수 더하기
                countMap.put(genres[i], countMap.get(genres[i]) + plays[i]);
            }
        }

        // 장르를 새로운 리스트에 담는다
        List<String> keySet = new ArrayList<>(countMap.keySet());
        // 해당 리스트를 value 내림차순으로 정렬
        keySet.sort((o1, o2) -> countMap.get(o2) - countMap.get(o1));

        for (String key : keySet) {
            // 해당 장르의 (인덱스, 재생횟수) map 을 꺼낸다.
            Map<Integer, Integer> nMap = music.get(key);
            // 꺼낸 map 의 key(인덱스)를 가지고 새로운 리스트를 생성한다.
            List<Integer> genreKey = new ArrayList<>(nMap.keySet());

            // 리스트의 정렬 기준을 map 의 value(재생 횟수)가 많은 순으로 정렬한다.
            genreKey.sort((o1, o2) -> nMap.get(o2) - nMap.get(o1));

            // 장르에 곡이 한 개일 경우 바로 넣고
            answer.add(genreKey.get(0));
            if (genreKey.size() > 1) {
                // 한 개 이상이면 두번째 곡까지 넣는다.
                answer.add(genreKey.get(1));
            }
        }

        // ArrayList 를 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        int[] arr = new Programmers42579().solution(genres, plays);
        for (int answer : arr) {
            System.out.println(answer);
        }
    }
}
