package com.java.practice;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}

	}

}

public class ThreadWithRunnable {

	public static void main(String[] args) {

		MyRunnable t = new MyRunnable();
		Thread f=new Thread(t);
		f.start();

		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}


	}

}
