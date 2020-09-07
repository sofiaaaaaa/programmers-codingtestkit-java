package com.practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 *
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 */
public class hash4 {
    public int[] solution(String[] genres, int[] plays) {


        Map<String, Integer> map = new HashMap<>();
        Dictionary dict = new Hashtable();
        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            SortedMap sp = (SortedMap) dict.get(key);
            if(sp == null){
                sp = new TreeMap();
            }
            sp.put(i, plays[i]);
            dict.put(key, sp);

        }
//        System.out.println(dict);

       Enumeration e =  dict.keys();
        while(e.hasMoreElements()){
            String key = (String) e.nextElement();
            SortedMap sp = (SortedMap) dict.get(key);
            int sum = 0;
            List<Integer> subElements = (List<Integer>) sp.values().stream().collect(Collectors.toList());
            for (int i: subElements){
                sum += i;
            }
            map.put(key, sum);
        }
//        System.out.println(map);

        SortedMap map2 = new TreeMap(Collections.reverseOrder());
        for (String key: map.keySet()){
            map2.put(map.get(key), key);
        }
//        System.out.println(map2);

        List<Integer> result = new ArrayList<>();
        for(Object key: map2.values()){
            SortedMap sm = (TreeMap) dict.get(key);
            Collection keys = sm.keySet();
//            System.out.println(keys);
            Collection values = sm.values();
//            System.out.println(values);
            List<Integer> sortedValues = (List<Integer>) values.stream().sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList());
            List<Integer> indexes = new ArrayList<>();

            for(Integer value: sortedValues){
                for (Object index : sm.keySet()) {
                    Integer i = (Integer) index;
                    if(sm.get(i) == value){
                        indexes.add(i);
                        if(indexes.size() == 2){
                            break;
                        }
                    }
                }
            }



//            System.out.println(indexes);

            result.addAll(indexes);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i]= result.get(i);
        }
//        System.out.println(answer);
        return answer;
    }
}
