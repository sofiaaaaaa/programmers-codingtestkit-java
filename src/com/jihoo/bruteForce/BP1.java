package com.jihoo.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 문제 설명
 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

 제한 조건
 시험은 최대 10,000 문제로 구성되어있습니다.
 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 입출력 예
 answers	return
 [1,2,3,4,5]	[1]
 [1,3,2,4,2]	[1,2,3]
 입출력 예 설명
 입출력 예 #1

 수포자 1은 모든 문제를 맞혔습니다.
 수포자 2는 모든 문제를 틀렸습니다.
 수포자 3은 모든 문제를 틀렸습니다.
 따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

 입출력 예 #2

 모든 사람이 2문제씩을 맞췄습니다.
 * */
public class BP1 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1=0, cnt2=0, cnt3=0;
        int idx1=0, idx2=0, idx3=0;

        for (int i = 0; i < answers.length; i++) {
            idx1= i%5;
            idx2= i%8;
            idx3= i%10;
            if(answers[i] == person1[idx1])  cnt1++;
            if(answers[i] == person2[idx2])  cnt2++;
            if(answers[i] == person3[idx3])  cnt3++;
        }


        int maxCnt = Math.max(cnt1, Math.max(cnt2, cnt3));

        List<Integer> list = new ArrayList<>();
        if(maxCnt == cnt1) list.add(1);
        if(maxCnt == cnt2) list.add(2);
        if(maxCnt == cnt3) list.add(3);

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}

