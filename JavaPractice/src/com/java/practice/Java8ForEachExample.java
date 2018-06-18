package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String args[]){
		
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++)
			myList.add(i);
		
		
		Iterator<Integer> it = myList.iterator();
		
		// Iterator
		while(it.hasNext()){
			Integer i = it.next();
			
			System.out.println("Iterator value : "+i);
		}
		
		
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t){
				System.out.println("Foreach ananomous class value :"+t);
			}
		}
		);
				
	}
	
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}
