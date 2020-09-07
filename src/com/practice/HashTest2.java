package com.practice;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
 *
 * 예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 */
public class HashTest2 {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        for(String[] array: clothes){
           String key = array[1];

           if(hm.get(key) == null){
               ArrayList<String> list = new ArrayList<String>();
               list.add(array[0]);
               hm.put(key, list);
           } else {
               ArrayList<String> list = hm.get(key);
               list.add(array[0]);
               hm.put(key, list);
           }
            System.out.println(hm);


        }

        for(String[] array: clothes){
            String key = array[1];
            Integer value = hm2.get(key);
            if(value == null) value = 1; else value ++;
            hm2.put(key, value);
            System.out.println(hm2);
        }

        int sum = 1;
        for(Integer i: hm2.values()){
           sum *= i+1;
        }

        answer = sum - 1;

        return answer;
    }


    private int factorial(int value) {
        if(value == 0) return 1;

        return value*factorial(value-1);
    }
}
