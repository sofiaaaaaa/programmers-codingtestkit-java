package com.jihoo.dfsBfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DfsBfsTest {
    @Test
    void solution() {
//        DfsBfs b = new DfsBfs();
//        assertEquals(5, b.solution(new int[]{1,1,1,1,1}, 3), "test");


//        DfsBfs2 b2 = new DfsBfs2();
//        assertEquals(2, b2.solution(3, new int[][]{new int[]{1,1,0}, new int[]{1,1,0}, new int[]{0,0,1}}), "test");
//        assertEquals(1, b2.solution(3, new int[][]{new int[]{1,1,0}, new int[]{1,1,1}, new int[]{0,1,1}}), "test2");


        DfsBfs4 b = new DfsBfs4();
        assertArrayEquals(new String[]{"ICN", "JFK", "HND", "IAD"}, b.solution(new String[][]{new String[]{"ICN","JFK"}, new String[]{"HND", "IAD"}, new String[] {"JFK", "HND"}}), "hello1");
        assertArrayEquals(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}, b.solution(new String[][]{new String[]{"ICN", "SFO"}, new String[]{"ICN", "ATL"}, new String[]{"SFO", "ATL"}, new String[]{"ATL", "ICN"}, new String[]{"ATL", "SFO"}}), "hello2");


    }
}

