package com.jihoo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortTest {

    @Test
    void solution() {
//        Sort1 s = new Sort1();
//        assertArrayEquals( new int[]{5,6,3}, s.solution( new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{new int[]{2, 5, 3},new int[]{4, 4, 1}, new int[]{1, 7, 3}}), "Hello");

//        Sort2 s = new Sort2();
//        assertEquals("6210", s.solution(new int[]{6, 10, 2}), "hello" );
//        assertEquals("9534330", s.solution(new int[]{3, 30, 34, 5, 9}), "hello" );

        Sort3 s = new Sort3();
        assertEquals(3, s.solution(new int[]{3,0,6,1,5}));

    }
}