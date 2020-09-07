package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 *
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 */
public class HashTest3 {
    public int[] solution(String[] genres, int[] plays) {

        int[] answer = {};

        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> hm2 = new HashMap<>();
        HashMap<String, HashMap<Integer,Integer>> hm3 = new HashMap<>();
        HashMap<String, Integer> hm4 = new HashMap<>();


        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            HashMap<Integer,Integer> m = hm3.get(key);
            Integer sum = 0;
            if(m == null)  {
                m = new HashMap<>();
            } else {
                for(Integer playTime: m.keySet()){
                    sum += playTime;
                }
            }

            sum += plays[i];

            m.put(plays[i],i);
            hm3.put(key, m);
            hm4.put(key, sum);
        }
        System.out.println("hm3:"+hm3);
        System.out.println("hm4:"+hm4);


        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            ArrayList<Integer> list = hm.get(key);
            if(list == null)  list = new ArrayList<>();
            list.add(plays[i]);
            Collections.sort(list, Collections.reverseOrder());
            hm.put(key, list);
        }
        System.out.println(hm);

        ArrayList<Integer> titles = new ArrayList<>();
        for(String key: hm.keySet()){
            ArrayList<Integer> list = hm.get(key);
            int sum = 0;
            for(int value: list){
                sum += value;
            }
            hm2.put(sum, list);
            titles.add(sum);
        }
        System.out.println(hm2);
        Collections.sort(titles, Collections.reverseOrder());

        ArrayList<Integer> newList = new ArrayList<>();
        for(int key: titles){
            ArrayList<Integer> list = hm2.get(key);



            if(list.size() > 0){
                newList.add(list.get(0));
                if(list.size() > 1) {
                    newList.add(list.get(1));
                }
            }
        }


        answer = newList.stream().mapToInt(i->i).toArray();
        System.out.println(newList);


        return answer;
    }


}
