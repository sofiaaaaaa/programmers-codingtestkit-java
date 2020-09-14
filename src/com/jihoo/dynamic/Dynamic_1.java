package com.jihoo.dynamic;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *  N으로 표현
 *
 *  아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.
 *
 * 12 = 5 + 5 + (5 / 5) + (5 / 5)
 * 12 = 55 / 5 + 5 / 5
 * 12 = (55 + 5) / 5
 *
 * 5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
 * 이처럼 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.
 *
 * 제한사항
 * N은 1 이상 9 이하입니다.
 * number는 1 이상 32,000 이하입니다.
 * 수식에는 괄호와 사칙연산만 가능하며 나누기 연산에서 나머지는 무시합니다.
 * 최솟값이 8보다 크면 -1을 return 합니다.
 * 입출력 예
 * N	number	return
 * 5	12	4
 * 2	11	3
 * 입출력 예 설명
 * 예제 #1
 * 문제에 나온 예와 같습니다.
 *
 * 예제 #2
 * 11 = 22 / 2와 같이 2를 3번만 사용하여 표현할 수 있습니다.
 */
public class Dynamic_1 {
    HashSet<Integer> check = new HashSet<Integer>();
    ArrayList<Integer>[] cache = new ArrayList[9];

    public int add(int left, int right) {
        return left + right;
    }

    public int sub(int left, int right) {
        return left - right;
    }

    public int mul(int left, int right) {
        return left * right;
    }

    public int div(int left, int right) {
        if (right == 0) return 0;
        return left / right;
    }

    public void addCache(int digit, int ret) {
        if (!check.contains(ret)) {
            check.add(ret);
            cache[digit].add(ret);
        }
    }

    public void cal(int digit, int left, int right) {
        addCache(digit, add(left, right));
        addCache(digit, sub(left, right));
        addCache(digit, mul(left, right));
        addCache(digit, div(left, right));
    }


    public int solution(int N, int number) {

        int temp = N;
        for (int i = 1; i < 9; i++) {
            if (temp == number) return i;
            cache[i] = new ArrayList<Integer>();
            cache[i].add(temp);
            check.add(temp);
            temp *= 10;
            temp += N;
        }

        for (int digit = 1; digit < 9; digit++) {
            for (int i = 1; i < digit; i++) {
                int j = digit - i;
                for (int left : cache[i]) {
                    for (int right : cache[j]) {
                        cal(digit, left, right);
                        if (check.contains(number)) {
                            return digit;
                        }
                    }
                }
            }
        }
        return -1;
    }
}

