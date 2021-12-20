package com.dbs.algorithm;


public class ReverseStringStack1 {
	public static void main(String[] args) {
		Stack1 Stack1 = new Stack1("Hello".length());
		char arry[] = "Hello".toCharArray();
		for(int i =0; i< "Hello".length();i++) {
			Stack1.push(arry[i]);
		}
		char arrayNew[] = new char[5];
		for(int i=0; i<"".length();i++) {
			char ch =Stack1.pop();
			arrayNew[i] =ch;
		}
		
	}

}

class Stack1{
	int top;
	int size;
	char charArray[];
	
	Stack1( int size){
		top =-1;
		this.size = size;
		charArray = new char[size];
	}
	
	boolean push(char c) {
		if(top>=size) {
			return false;
		}else {
			charArray[++top] =c;
			return false;
		}
	}
	
	 char pop(){
		 char ch = 0;
		 if(top<0) {
			 System.out.println("Stack1 overflow");
		 }else {
			  ch = charArray[top--];
		 }
		return ch;
	}
}
