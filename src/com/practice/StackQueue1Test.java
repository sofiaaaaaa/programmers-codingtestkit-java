package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackQueue1Test {

    @Test
    void solution() {

//                 * 2	10	[7,4,5,6]	8
//                * 100	100	[10]	101
//                * 100	100	[10,10,10,10,10,10,10,10,10,10]	110

        StackQueue1 s = new StackQueue1();
        assertEquals(8, s.solution(2, 10, new int[]{7,4,5,6}), "Hello~");
        assertEquals(110, s.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), "Hello~");
        assertEquals(2, s.solution(1, 1, new int[]{1}), "Hello~");

        assertEquals(101, s.solution(100, 100, new int[]{10}), "Hello~");

    }
}