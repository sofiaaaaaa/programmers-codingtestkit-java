package com.practice;

import java.util.*;

/**
 *  이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.
 * I 숫자	큐에 주어진 숫자를 삽입합니다.
 * D 1	큐에서 최댓값을 삭제합니다.
 * D -1	큐에서 최솟값을 삭제합니다.
 *
 * */
public class Heap3 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (String command: operations){
            if(command.startsWith("I")){
                String[] array = command.split(" ");
                if(array.length == 2) {
                    Integer a = Integer.parseInt(array[1]);
                    pq.add(a);
                }
            } else if(command.equals("D 1")){
                Integer maxValue = this.getMax(pq);
                if(maxValue != null){
                    pq.removeIf(x -> Objects.equals(x, maxValue));
                }
            } else if(command.equals("D -1")) {
                Integer minValue = this.getMin(pq);
                if(minValue != null){
                    pq.removeIf(x -> Objects.equals(x, minValue));
                }
            }
        }


        Integer maxValue = this.getMax(pq);
        answer[0] = maxValue == null ? 0 : maxValue;

        Integer minValue = this.getMin(pq);
        answer[1] = minValue == null ? 0 : minValue;

//        Arrays.stream(answer).forEach( s -> System.out.println(s));


        return answer;
    }

    private Integer getMax(PriorityQueue<Integer> pq){
        if(pq.isEmpty()){
            return null;
        }

        Optional<Integer> max = pq.stream().max(Comparable::compareTo);
        if(max != null){
            return  max.get();
        }
        return null;
    }

    private Integer getMin(PriorityQueue<Integer> pq){
        if(pq.isEmpty()){
            return null;
        }
        Optional<Integer> min = pq.stream().min(Comparable::compareTo);

        if(min != null){
            return  min.get();
        }

        return null;
    }

}

