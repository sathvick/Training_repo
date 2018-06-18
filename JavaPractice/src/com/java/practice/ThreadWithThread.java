package com.java.practice;

class ThreadSample extends Thread{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread using Thread Class");
		}
	}


}

public class ThreadWithThread {

	public static void main(String args[]){	

		Thread.currentThread().setPriority(1);

		ThreadSample t = new ThreadSample();
		t.setPriority(10);
		t.start();
		System.out.println(t.getPriority());

		for(int i=0; i<10; i++){
			System.out.println("Main Thread");

		}
		//6957587351

	}

}

