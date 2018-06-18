package com.java.practice;

import java.util.concurrent.locks.ReentrantLock;

public class ReentranceLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReentrantLock rl = new ReentrantLock();
		System.out.println("Before Lock");
		System.out.println(rl.isLocked());
		System.out.println(rl.isHeldByCurrentThread());
		System.out.println(rl.isFair());
		System.out.println(rl.getHoldCount());
		System.out.println(rl.getQueueLength());
		
		
		rl.lock();
		
		rl.lock();
		System.out.println("After Lock");
		System.out.println(rl.isLocked());
		System.out.println(rl.isHeldByCurrentThread());
		System.out.println(rl.isFair());
		System.out.println(rl.getHoldCount());
		System.out.println(rl.getQueueLength());
		
		
		

	}

}
