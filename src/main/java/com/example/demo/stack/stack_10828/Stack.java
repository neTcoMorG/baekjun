package com.example.demo.stack.stack_10828;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    List<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push (int data) {
        stack.add(data);
    }

    public int pop () {
        if (stack.isEmpty()) {
            return -1;
        }
        int result = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return result;
    }

    public int size () {
        return this.stack.size();
    }

    public int empty () {
        if (this.stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public int top() {
        if (this.stack.isEmpty()) {
            return -1;
        }
        return this.stack.get(this.stack.size()-1);
    }
}
