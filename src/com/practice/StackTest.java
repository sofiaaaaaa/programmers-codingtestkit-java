package com.practice;

import static org.junit.jupiter.api.Assertions.*;

//https://www.vogella.com/tutorials/JUnit/article.html
class StackTest {

    @org.junit.jupiter.api.Test
    void solution() {
        StackQueue s = new StackQueue();
        assertArrayEquals(new int[]{2,1}, s.solution(new int[]{93, 30, 55},new int[]{1, 30, 5} ), "Hello~");

        assertArrayEquals(new int[]{1, 3, 2}, s.solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1} ), "Hello~");

    }
}