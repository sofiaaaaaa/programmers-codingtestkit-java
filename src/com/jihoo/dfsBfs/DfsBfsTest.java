package com.jihoo.dfsBfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DfsBfsTest {
    @Test
    void solution() {

        DfsBfs b = new DfsBfs();
        assertEquals(5, b.solution(new int[]{1,1,1,1,1}, 3), "test");


//                * 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
//                * 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1

    }
}

