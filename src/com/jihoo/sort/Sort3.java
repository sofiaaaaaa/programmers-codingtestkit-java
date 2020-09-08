package com.jihoo.sort;

import java.util.Arrays;

/**
 *
     문제 설명
     H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

     어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

     어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

     제한사항
     과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
     논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
     입출력 예
     citations	return
     [3, 0, 6, 1, 5]	3
     입출력 예 설명
     이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

 *
 */
public class Sort3 {

    private class Number{

        int index;
        int count;

        @Override
        public String toString() {
            return "Number{" +
                    "index=" + index +
                    ", count=" + count +
                    '}';
        }

        public Number(int index, int count) {
            this.index = index;
            this.count = count;
        }

        public int getIndex() {
            return index;
        }

        public int getCount() {
            return count;
        }
    }
    public int solution(int[] citations) {
        int answer = 0;

        int cnt = citations.length;
        int h = 0;
        int k = 0;
        Arrays.sort(citations);

        for (int i = 0; i < cnt; i++) {
            h = citations[i];
            k =  cnt - i;
            if (k <= h) {
                answer = k;
                break;
            }
        }

//        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
//
//        if(list.stream().allMatch(n-> n == 0)){
//            return 0;
//        }
//
//        Collections.sort(list, Collections.reverseOrder());
//
//        int count = 0;
//        List<Number> list2 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            count = 0;
//            for (int j = 0; j < list.size(); j++) {
//                int citation = citations[j];
//                if (citation >= i) count++;
//            }
//
//            list2.add(new Number(i, count));
//        }
//
//        System.out.println(list);
//
//        for (Number num: list2){
//            System.out.println(num.toString());
//            if(num.getCount() <= num.getIndex()){
//                answer = num.getIndex();
//                break;
//            }
//        }


//        int i = 0;
//        boolean flag = true;
//        while(flag){
//            int hCount = citations[i];
//            int hHigh = 0;
//            int hLow = 0;
//
//            for (int j = 0; j < citations.length; j++) {
//                int citation = citations[j];
//                if(hCount >= citation) hHigh++;
//                if(hCount <= citation) hLow++;
//                if(hCount == hHigh && hCount == hLow){
//                   answer = hCount;
//                   flag = false;
//                   break;
//                }
//            }
//
//            i++;
//            if(i == citations.length -1){
//                i = 0;
//            }
//        }



        return answer;
    }

}
