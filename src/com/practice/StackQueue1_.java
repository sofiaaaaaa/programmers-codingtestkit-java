package com.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
 * ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
 *
 * 2	10	[7,4,5,6]	8
 * 100	100	[10]	101
 * 100	100	[10,10,10,10,10,10,10,10,10,10]	110
 *
 * 예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
 */
public class StackQueue1_ {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int bridgeLength = bridge_length;
        int maxWeight = weight;

        Queue<Integer> q = new LinkedList<>();
        for (int item: truck_weights){
            q.add(item);
        }

        System.out.println(q);

        int truckWeight = q.poll();
        int distance = 0;
        int seconds = 0;
        int sum = truckWeight;

        System.out.println(+maxWeight+"kg is the bridge's maximum weight.");
        while(true){

            System.out.println(seconds+" seconds: Total Truck ("+sum+" kg) is passing "+distance+"km the bridge.");

            if(bridgeLength+1 == distance) {
                System.out.println(truckWeight + "kg truck has arrived..");
                distance = 0;

                if (q.isEmpty()){
                    break;
                }

                if(maxWeight >= (sum + q.peek())){
                    System.out.print(truckWeight+ "kg truck and.." );
                    truckWeight = q.poll();
                    sum += truckWeight;
                    System.out.println(truckWeight+ "kg truck has also departed .." );
                } else {
                    truckWeight = q.poll();
                    sum = truckWeight;
                    System.out.println(truckWeight+ "kg truck has departed ..");

                }
            }


            seconds++;
            distance++;
        }

        answer = seconds;
        return answer;
    }
}

