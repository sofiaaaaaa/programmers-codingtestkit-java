package com.jihoo.bruteForce;

import com.jihoo.sort.Sort3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BPTest {

    @Test
    void solution() {
        BP1 b = new BP1();
        assertArrayEquals(new int[]{1}, b.solution(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{1,2,3}, b.solution(new int[]{1,3,2,4,2}));

    }
}