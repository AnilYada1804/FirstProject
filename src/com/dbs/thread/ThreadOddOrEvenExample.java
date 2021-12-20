package com.dbs.thread;

public class ThreadOddOrEvenExample {
	static int N;
	 int count =1;

	public static void main(String[] args) {
		N = 10;
		ThreadOddOrEvenExample th = new ThreadOddOrEvenExample();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				th.printEvenNumber();
			}
		});
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				th.printOddNumbers();
			}
		});
		t.start();
		t1.start();
	}

	protected void printOddNumbers() {
		synchronized (this) {
			while (N > count) {
				if (count % 2 == 0) {
					try {
						wait(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("odd "+count+" ");
				count++;
				notify();
			}
		}
	}

	protected void printEvenNumber() {
		synchronized (this) {
			while (N > count) {
				if (count % 2 == 1) {
					try {
						wait(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("even "+count+" ");
				count++;
				notify();
			}
		}
	}

}
