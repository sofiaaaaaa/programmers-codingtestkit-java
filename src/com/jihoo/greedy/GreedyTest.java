package com.jihoo.greedy;

import com.jihoo.sort.Sort3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreedyTest {

    @Test
    void solution() {

        Greedy1 g = new Greedy1();
        assertEquals(5, g.solution(5,new int[]{2, 4},new int[]{1, 3, 5}),"test1");
        assertEquals(4, g.solution(5,new int[]{2, 4},new int[]{3}),"test1");
        assertEquals(2, g.solution(3,new int[]{3},new int[]{1}),"test1");

    }
}