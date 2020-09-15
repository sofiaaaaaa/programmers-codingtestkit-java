package com.jihoo.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {

    @Test
    void solution() {
//        Graph g = new Graph();
//        assertEquals(3, g.solution(6, new int[][]{
//                new int[]{3, 6},new int[]{4, 3},new int[]{3, 2}, new int[]{1, 3}, new int[]{1, 2}, new int[]{2, 4}, new int[]{5, 2}
//        }), "test");

//        Graph2 g = new Graph2();
//        assertEquals(2, g.solution(5, new int[][]{new int[]{4, 3},new int[]{4, 2},new int[]{3, 2},new int[]{1, 2},new int[]{2, 5}}), "test");


        Graph3 g = new Graph3();
        assertEquals(3, g.solution(new int[]{6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0}));

    }
}

