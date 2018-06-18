package com.java.practice;

import java.util.concurrent.locks.ReentrantLock;

public class ReeterantLockTest2 {

	public static void main(String args[]){

		Display d = new Display();
		MyThread t = new MyThread(d, "Sudha");
		MyThread t2 = new MyThread(d, "sachin");
		MyThread t3 = new MyThread(d, "sudhakar");

		t.start();
		t2.start();
		t3.start();

	}

}

class Display{
	ReentrantLock i = new ReentrantLock();

	public void wish(String name){
		i.lock();

		for(int j=0; j<3; j++){
			System.out.println("Good Morning !!");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.println(name);

		}
		i.unlock();	

	}
}

class MyThread extends Thread{

	Display d;
	String name;

	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}

	public void run(){
		d.wish(name);
	}
}
