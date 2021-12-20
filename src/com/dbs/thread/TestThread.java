package com.dbs.thread;

public class TestThread extends Thread {
	public static void main(String[] args) {
		Thread t =  new Thread(new TestThread());
		t.start();
		test();
		
	}
	public  void run() {
		System.out.println("running thread");
	}
	public static void test() {
		System.out.println("Hello");
	}

}
