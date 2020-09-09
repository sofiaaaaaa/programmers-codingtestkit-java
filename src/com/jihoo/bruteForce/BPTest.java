package com.jihoo.bruteForce;

import com.jihoo.sort.Sort3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BPTest {

    @Test
    void solution() {
//        BP1 b = new BP1();
//        assertArrayEquals(new int[]{1}, b.solution(new int[]{1,2,3,4,5}));
//        assertArrayEquals(new int[]{1,2,3}, b.solution(new int[]{1,3,2,4,2}));

//        BP2 b = new BP2();
//        assertEquals(3, b.solution("17"), "heeeeeee");
//        assertEquals(2, b.solution("011"), "heeeeeee2");

        BP3 b = new BP3();

        assertArrayEquals(new int[]{4,3}, b.solution(10, 2),"heeeeeee");
        assertArrayEquals(new int[]{3,3}, b.solution(8, 1),"heeeeeee2");
        assertArrayEquals(new int[]{8,6}, b.solution(24, 24),"heeeeeee3");

    }
}