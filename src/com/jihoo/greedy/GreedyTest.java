package com.jihoo.greedy;

import com.jihoo.sort.Sort3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreedyTest {

    @Test
    void solution() {
//
//        Greedy1_1 g = new Greedy1_1();
//        assertEquals(5, g.solution(5,new int[]{2, 4},new int[]{1, 3, 5}),"test1");
//        assertEquals(4, g.solution(5,new int[]{2, 4},new int[]{3}),"test2");
//        assertEquals(2, g.solution(3,new int[]{3},new int[]{1}),"test2");
//
//        Greedy2 g = new Greedy2();
//        assertEquals("94", g.solution("1924", 2),"test1");
//        assertEquals("3234", g.solution("1231234", 3),"test2");
//        assertEquals("775841", g.solution("4177252841", 4),"test3");

//        Greedy3 g = new Greedy3();
//        assertEquals(56, g.solution("JEROEN"), "test1");
//        assertEquals(23, g.solution("JAN"), "test2");

//        Greedy4 g = new Greedy4();
//        assertEquals(3, g.solution(new int[]{70, 50, 80, 50}, 100), "test1");
//        assertEquals(3, g.solution(new int[]{70, 80, 50}, 100), "test1");
//
//        Greedy5 g = new Greedy5();
//        assertEquals(4, g.solution(4, new int[][]{new int[]{0,1,1},new int[]{0,2,2},new int[]{1,2,5},new int[]{1,3,1},new int[]{2,3,8}}), "test1");

        Greedy6 g = new Greedy6();
        assertEquals(2, g.solution(new int[][]{new int[]{-20,15}, new int[]{-14,-5}, new int[]{-18,-13}, new int[]{-5,-3}}), "test1");


    }
}