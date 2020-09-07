package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Heap1Test {

    @Test
    void solution() {
//
//        Heap1 s = new Heap1();
//
//        assertEquals(2, s.solution( new int[]{1, 2, 3, 9, 10, 12}, 7), "Hello~");
//
//        Heap2 b = new Heap2();
//
//        assertEquals(9, b.solution( new int[][]{new int[] {0,3}, new int[] {1,9}, new int[] {2,6}}), "Hello~");

        Heap3 c = new Heap3();

//        assertArrayEquals(new int[]{0,0}, c.solution(new String[]{"I 16","D 1"}), "Hello~");
//        assertArrayEquals(new int[]{7,5}, c.solution(new String[]{"I 7","I 5","I -5","D -1"}), "Hello2");
        assertArrayEquals(new int[]{333,-45}, c.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}), "Hello2");

    }
}