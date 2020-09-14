package com.jihoo.binarySearch;

import com.jihoo.greedy.Greedy6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void solution() {
        Greedy6 g = new Greedy6();
        assertEquals(2, g.solution(new int[][]{new int[]{-20,15}, new int[]{-14,-5}, new int[]{-18,-13}, new int[]{-5,-3}}), "test1");
    }
}

