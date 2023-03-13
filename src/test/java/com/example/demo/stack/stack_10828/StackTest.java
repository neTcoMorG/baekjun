package com.example.demo.stack.stack_10828;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack();

    @Test
    @DisplayName("10828 테스트")
    void test_10828 () {
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.top());
        assertEquals(2, stack.size());
        assertEquals(0, stack.empty());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(-1, stack.pop());
        assertEquals(0, stack.size());
        assertEquals(1, stack.empty());
        assertEquals(-1, stack.pop());
        stack.push(3);
        assertEquals(0, stack.empty());
        assertEquals(3, stack.top());
    }
}