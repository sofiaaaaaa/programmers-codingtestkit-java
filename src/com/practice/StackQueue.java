package com.practice;

import java.util.*;

/**
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
 * 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 *
 */
public class StackQueue {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[]{};

//        Stack<Integer> a = new Stack<>();
//        Stack<Integer> b = new Stack<>();
//
//
//        for (int progress: progresses){
//            a.add(progress);
//        }
//
//        for (int speed: speeds){
//            b.add(speed);
//        }

//        Enumeration ea = a.elements();
//
//        while(ea.hasMoreElements()){
//            int progress = (int) ea.nextElement();
//            System.out.println();
//        }
//
//        Enumeration eb = b.elements();
//        while(eb.hasMoreElements()){
//            System.out.println(eb.nextElement());
//        }


        //http://tutorials.jenkov.com/java-collections/queue.html
        Queue<Integer> q = new LinkedList<>();


        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];

            System.out.println(progress+" by speed "+ speed+" will takes " + (int) Math.ceil((double) (100 - progress)/speed )+ "days");

            int days = (int) Math.ceil((double) (100 - progress)/speed);
            q.add(days);
        }

        int count = 0;
        int prevDays = 0;
        int days = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()){
            if(count == 0){
                count = 1;
                prevDays = q.poll();
                days = prevDays;
                continue;
            }

            days = q.poll();

            System.out.println("preDays > "+prevDays+" / days > "+days);
            if(prevDays >= days){
                count ++;
            } else {
                prevDays = days;
                temp.add(count);
                count = 1;
            }

            if(q.isEmpty()){
                temp.add(count);
            }
        }


        System.out.println("result > "+ temp);

        answer = temp.stream().mapToInt(i->i).toArray();

        return answer;
    }
}
