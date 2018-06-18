package com.java.practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {

	public static void main(String[] args) {
		

		MyThreadTry mt = new MyThreadTry("chirakala");
		MyThreadTry mt2 = new MyThreadTry("sai");
		MyThreadTry mt3 = new MyThreadTry("sathvick");

		mt.start();
		mt2.start();
		mt3.start();

	}

}


class MyThreadTry extends Thread{

	static ReentrantLock rl = new ReentrantLock();

	MyThreadTry(String name){
		super(name);
	}

	public void run(){
		do{

			try {
				if(rl.tryLock(1000, TimeUnit.MICROSECONDS)){
					System.out.println(Thread.currentThread().getName()+" Got Lock and performing safe operation");

					try{
						Thread.sleep(5000);
					}catch(InterruptedException ie){

					}finally{
						rl.unlock();
					}
					System.out.println(Thread.currentThread().getName()+" ----------- Release Lock");
					break;
				}else{
					System.out.println(Thread.currentThread().getName()+" --- Unable to get lock and hence performing alternative operations");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(true);
	}
}