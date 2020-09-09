package com.jihoo.bruteForce;

import java.util.*;

/**
 * 소수찾기
 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

 제한사항
 numbers는 길이 1 이상 7 이하인 문자열입니다.
 numbers는 0~9까지 숫자만으로 이루어져 있습니다.
 013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 입출력 예
 numbers	return
 17	3
 011	2
 입출력 예 설명
 예제 #1
 [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

 예제 #2
 [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

 11과 011은 같은 숫자로 취급합니다.
 * */
public class BP2 {
    public int solution(String numbers) {
        int answer = 0;
        int n = Integer.parseInt(numbers);

        String[] strs = numbers.split("");

        ArrayList<Integer> list = new ArrayList<>();

        for (String s: strs){
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list, Collections.reverseOrder());

        String reversedStr = list.stream().map(String::valueOf).reduce((a, b) -> a.concat(b)).get();

        int bigNumber = Integer.parseInt(reversedStr);
        boolean[] sosuList = new boolean [bigNumber+1];

        for (int i = 0; i <= bigNumber; i++) {
            sosuList[i] = true;
        }

        int root = (int) Math.sqrt(bigNumber);

        for(int i=2; i<=root; i++){
            if(sosuList[i] == true){
                for (int j = i; i*j <=bigNumber; j++) {
                    sosuList[i*j] = false;
                }
            }
        }

        for(int i=2; i<=bigNumber; i++){
            if(!sosuList[i]){
               continue;
            }

            String[] strs2 = String.valueOf(i).split("");
            ArrayList<Integer> newNumbers = new ArrayList<>();
            for (String s: strs2){
                Integer num = Integer.parseInt(s);
                newNumbers.add(num);
            }

            if(this.containsGivenArray(newNumbers, list)){
                answer++;
            }
        }


        return answer;
    }

    private boolean containsGivenArray(ArrayList<Integer> newNumbers, ArrayList<Integer> source){
        ArrayList<Integer> givenNumbers = new ArrayList<>();
        givenNumbers.addAll(source);


        Iterator<Integer> iter = newNumbers.iterator();
        while (iter.hasNext()) {
            Integer a = iter.next();
            Iterator<Integer> iter2 = givenNumbers.iterator();
            while (iter2.hasNext()) {
                Integer b = iter2.next();
                if (a.equals(b)) {
                    iter.remove();
                    iter2.remove();
                    break;
                }
            }
        }

        if(newNumbers.isEmpty()){
            return true;
        }

        return false;
    }
}

