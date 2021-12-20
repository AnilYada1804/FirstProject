package com.dbs.algorithm;

public class ReverseAStringUsingStack {
	public static void main(String[] args) {
		System.out.println(reverseString(new StringBuffer("Hello")));
	}

	public static String reverseString(StringBuffer str) {
		// Create a stack of capacity
		// equal to length of string
		int n = str.length();
		Stack obj = new Stack(n);

		// Push all characters of string
		// to stack
		int i;
		for (i = 0; i < n; i++)
			obj.push(str.charAt(i));

		// Pop all characters of string
		// and put them back to str
		for (i = 0; i < n; i++) {
			char ch = obj.pop();
			str.setCharAt(i, ch);
		}
		String result = str.toString();
		return result;
	}

}

class Stack {
	int size;
	int top;
	char[] a;

	public Stack(int in) {
		top = -1;
		size = in;
		a = new char[size];
	}

	// function to check if stack is empty
	boolean isEmpty() {
		return top < 0;
	}

	// function to push an element into a stack
	boolean push(char x) {
		if (top >= size) {
			return false;
		} else {
			a[++top] = x;
			return true;
		}
	}

	// function to pop an element from a stack
	char pop() {
		if (top < 0) {
			System.out.println("stack overflow");
			return 0;
		} else {
			char x = a[top--];
			return x;
		}
	}

}