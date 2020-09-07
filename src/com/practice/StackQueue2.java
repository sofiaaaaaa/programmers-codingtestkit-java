package com.practice;


import java.util.*;


/**
 * 일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다.
 * 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
 */
public class StackQueue2 {

    private class PrintItem{
        private int order;
        private int priority;

        public PrintItem(int order, int priority) {
            this.order = order;
            this.priority = priority;
        }

        public int getOrder() {
            return order;
        }
        public int getPriority() {
            return priority;
        }

    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> prioritiQ = new LinkedList<>();
        Queue<PrintItem> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            int p = priorities[i];
            PrintItem pi = new PrintItem(i, p);
            q.add(pi);
            prioritiQ.add(p);
        }

        while(!q.isEmpty()) {
            PrintItem pi = q.poll();
            int i = pi.getOrder();
            int p = pi.getPriority();

            //현재 문서의 중요도가 가장 높은 중요도라면 인쇄
            Integer max = this.getMaxQueue(prioritiQ);
            if(p == max) {
                prioritiQ.poll();
                answer += 1;

                if ( i == location) {
                    break;
                }

            } else {
                q.add(pi);

                prioritiQ.add(prioritiQ.poll());

            }


        }

        return answer;
    }

    private void printQ(Queue<PrintItem> q){
        System.out.println("-");
        for(PrintItem i: q){
            System.out.print(i.getOrder()+"="+ i.getPriority()+" , ");
        }
        System.out.println("-");
    }

    private Integer getMaxQueue(Queue<Integer> q) {
        Optional<Integer> max = q.stream()
                .max(Comparable::compareTo);
//        System.out.println("max  "+max.get());
        if(max.isPresent()){
            return max.get();
        }

        return null;
    }


}
