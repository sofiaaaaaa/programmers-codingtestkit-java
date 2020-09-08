package com.jihoo.sort;

import java.util.Arrays;

/**
 *
     0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
     예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
     0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
     제한 사항
     numbers의 길이는 1 이상 100,000 이하입니다.
     numbers의 원소는 0 이상 1,000 이하입니다.
     정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
     입출력 예
     numbers	return
     [6, 10, 2]	6210
     [3, 30, 34, 5, 9]	9534330
 *
 */
public class Sort2 {

    public class Number implements Comparable<Number> {
        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        private int a;
        private int b;

        public Number(int a, int b) {
            this.a = a;
            this.b = b;
        }


        @Override
        public int compareTo(Number num) {
        return num.a - this.a;
        }

        @Override
        public String toString() {
            return "Number{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
    
    public String solution(int[] numbers) {
        String answer = "";
//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//        String[] bList = new String[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            String b = numbers[i]+"";
//            bList[i] = b;
//        }

        Number[] aList = new Number[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            String value = "";
            String b = n+"";
            for (int j = 0; j < 5; j++) {
                value += b;
            }

            Number number = new Number(Integer.parseInt(value.substring(0,5)), n);
            aList[i] = number;

        }

        Arrays.sort(aList);



//        List<Integer> list = Arrays.stream(aList).collect(Collectors.toList());
//        System.out.println("list " + aList);

        for (Number num: aList){
            System.out.println(num.toString());
            answer += num.getB()+"";
        }

        System.out.println(answer);

        if(answer.startsWith("0")){
            answer = "0";
        }

        return answer;
    }
}
