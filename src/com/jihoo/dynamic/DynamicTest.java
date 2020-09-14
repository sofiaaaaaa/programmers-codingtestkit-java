package com.jihoo.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTest {
    @Test
    void solution() {
//        Dynamic g = new Dynamic();
//        assertEquals(4, g.solution(5, 12), "test1");
//        assertEquals(3, g.solution(2, 11), "test1");

//        Dynamic2 g = new Dynamic2();
//        assertEquals(30, g.solution(new int[][]{new int[]{7},new int[]{3, 8},new int[]{8, 1, 0},new int[]{2, 7, 4, 4},new int[]{4, 5, 2, 6, 5} }), "test1");

//        Dynamic3 g = new Dynamic3();
//        assertEquals(4, g.solution(4,3,new int[][]{new int[]{2,2,}}));

        Dynamic4 g = new Dynamic4();
        assertEquals(4, g.solution(new int[]{1,2,3,1}), "hello");

    }
}

