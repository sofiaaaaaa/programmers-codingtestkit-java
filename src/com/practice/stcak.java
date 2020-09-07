package com.practice;

import java.util.*;

/**
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 */
public class stcak {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
//        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> s  = new LinkedList<>();


        for (int price: prices){
            s.add(price);
            System.out.print(price+", ");
        }



        int i = 0;
        int seconds = 0;
        while(!s.isEmpty()) {
            seconds = 0;
            int price = s.poll();
            Iterator iterator = s.iterator();
            while (iterator.hasNext()) {
                int price2 = (int) iterator.next();
//                System.out.println(price+"  price");
//                System.out.println(price2+"  price2");
                seconds += 1;
                if(price > price2) {
                    break;
                }
//                System.out.println(price2+"  price2");

            }
            answer[i] = seconds;
            i++;
        }

        System.out.println();

        for (int j = 0; j < answer.length; j++) {
            System.out.print(answer[j]+",");
        }

        return answer;
    }
}
