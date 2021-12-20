package com.dbs.algorithm;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// store the element in stack
		Stack<String> stack = new Stack<String>();
		stack.push("Mitul");
		stack.push("Anil");
		stack.push("Rat");
		System.out.println("adding elements:)" + stack);

		// fetch last elements in the stack
		stack.peek();
		System.out.println("last elements: " + stack);

		// removing the elements
//		stack.pop();
//		System.out.println("accessing elements: " + stack);

//		stack.pop();
//		System.out.println("accessing elements: " + stack);
		Stack<Integer> input = new Stack<Integer>();
		input.add(2);
		input.add(1);
		input.add(3);
		sortstack(input);

	}

	public static Stack<Integer> sortstack(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {
			int tmp = input.pop();

			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
				input.push(tmpStack.pop());
			}

			tmpStack.push(tmp);
		}
		return tmpStack;
	}
}
