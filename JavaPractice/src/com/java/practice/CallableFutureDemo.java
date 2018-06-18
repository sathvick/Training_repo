package com.java.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable jobs[] ={
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50)
				
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallable job:jobs){
			Future f = service.submit(job);
			System.out.println(f.get());
		}

	}

}

class MyCallable implements Callable{
	int num;
	
	MyCallable(int num){
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		int sum = 0;
		
		for(int i=0; i<num; i++){
			sum = sum+i;
		}
		return sum;
	}
	
	
}