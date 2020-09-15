package com.jihoo.binarySearch;

import com.jihoo.greedy.Greedy6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void solution() {
//        BinarySearch1 b = new BinarySearch1();
//        assertEquals(28, b.solution(6, new int[]{7, 10}));

        BinarySearch2 b = new BinarySearch2();
        assertEquals(4, b.solution(25, new int[]{2, 14, 11, 21, 17}, 2));

    }
}

