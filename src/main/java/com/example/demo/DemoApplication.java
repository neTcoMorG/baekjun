package com.example.demo;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DemoApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] commands = new String[N];
		Stack stack = new Stack();

		for (int i=0; i<N; i++) {
			commands[i] = scan.nextLine();
		}

		for (int i=0; i<N; i++) {
			String[] split = commands[i].split(" ");

			if (split[0].equals("push")) stack.push(Integer.parseInt(split[1]));
			if (split[0].equals("top")) System.out.println(stack.top());
			if (split[0].equals("size")) System.out.println(stack.size());
			if (split[0].equals("pop")) System.out.println(stack.pop());
			if (split[0].equals("empty")) System.out.println(stack.empty());
		}
	}
}
class Stack {
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
