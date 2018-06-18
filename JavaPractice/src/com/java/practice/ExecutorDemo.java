package com.java.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs ={
				new PrintJob("Sudha"),
				new PrintJob("Saraswathi"),
				new PrintJob("Sudhakar"),
				new PrintJob("Anusha"),
				new PrintJob("Narasimharao"),
				new PrintJob("Sarojini")
		};

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(PrintJob job: jobs){
			service.submit(job);
		}
		service.shutdown();
	}

}


class PrintJob implements Runnable{
	
	String name;
	
	PrintJob(String name){
		this.name = name;
	}
	

	@Override
	public void run() {
	
		System.out.println(name+" ----- Job Started by thread :"+Thread.currentThread().getName());
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ie){
			
		}
		System.out.println(name+"--------- Job completed by Thread: "+Thread.currentThread().getName());
		
	}
	
}