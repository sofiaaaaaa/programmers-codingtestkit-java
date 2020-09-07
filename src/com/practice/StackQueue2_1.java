package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다.
 * 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
 */
public class StackQueue2_1 {

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

        Queue<PrintItem> printItems = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            int p = priorities[i];
            System.out.println("item : "+p);
            PrintItem pi = new PrintItem(i, p);

            printItems.add(pi);
        }

        int prevPriority = priorities[0];
        int pointer = 1;
        while(true){
            int priority = priorities[pointer];
            System.out.println("prevPriority: "+prevPriority+" priority: "+priority);
            if(this.hasHigherPriorities(pointer, priorities)) {
                System.out.println(prevPriority+" printItem has moved.");
                printItems.add(printItems.poll());
            }
            prevPriority = priority;

            if(pointer == priorities.length -1){
                if(this.isSorted(printItems)){
                    break;
                }
                pointer = 1;
            } else {
                pointer++;
            }

        }

        System.out.println("===========");
        for (int i = 0; i < priorities.length; i++) {
            System.out.println(i+" "+priorities[i]);
        }
        System.out.println("===========");

        for (PrintItem item: printItems){
            System.out.println(item.getOrder() + " " + item.getPriority());
        }

        System.out.println("===========");
        System.out.println("location "+location);
        for(PrintItem pi: printItems) {
            answer++;
            if( pi.getOrder() == location) {
                System.out.println("answer "+answer);
                return answer;
            }
        }
        return answer;
    }

    private boolean hasHigherPriorities(int i, int[] priorities) {
        int pri = priorities[i-1];
        for ( int j = i; j < priorities.length ; j++) {
            if(pri < priorities[j]) {
                return true;
            }
        }
        return false;
    }

    private boolean isSorted(Queue<PrintItem> items) {
        ArrayList<Integer> list  = new ArrayList<>();
        for (PrintItem item: items){
            list.add(item.priority);
        }
        System.out.println("List => "+list);
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i) < list.get(i+1)) {
                System.out.println(list.get(i)+" "+list.get(i+1));
                return false;
            }
        }
        return true;
    }
}
