package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQueue2Test {

    @Test
    void solution() {
        StackQueue2 s = new StackQueue2();
        assertEquals(1, s.solution(new int[]{2, 1, 3, 2}, 2), "hello");
        assertEquals(5, s.solution(new int[]{1, 1, 9, 1, 1, 1}, 0), "hello2");
//        assertEquals(3, s.solution(new int[]{1, 2, 3}, 0), "hello3");

    }
}