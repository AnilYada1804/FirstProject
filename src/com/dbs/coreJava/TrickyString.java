package com.dbs.coreJava;

public class TrickyString {
	public static void main(String[] args) {
		TrickyString obj = null;
		obj.foo();
//		toString(); //throw compiletime error
	}
	public static String foo() {
		System.out.println("foo method ");
		return "";
	}

}
