package com.dbs.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class CallableExample {
	static Integer value = new AtomicInteger().get();
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService servcie = Executors.newFixedThreadPool(10);
		List<Future<Integer>> allFuture = new ArrayList();
		for(int i=0; i<100; i++) {
			allFuture.add(servcie.submit(new Task()));
		}
		for(Future<Integer> future : allFuture) {
			System.out.println("value: "+future.get());
		}
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
	
	static class Task implements Callable<Integer>{
		@Override
		public Integer call() throws InterruptedException{
			return value++;
		}
	}
}
