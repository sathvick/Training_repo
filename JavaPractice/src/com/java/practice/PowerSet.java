package com.java.practice;

import java.util.*;

public class PowerSet {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		for(int i=0; i<=3; i++)
			list.add(i);

		System.out.println(getSubsetUsingBitMap(list));
	}
	private static Set<Set<Object>> getSubsetUsingBitMap(List<Object> list){

		Set<Set<Object>> result = new HashSet<Set<Object>>();

		int numOfSubsets =(int) Math.pow(2,list.size());
		for(int i = 0; i < numOfSubsets; i++){

			Set<Object> subset = new HashSet<Object>();

			int mask = 1;
			for(int k = 0; k < list.size(); k++){

				if((mask & i) != 0){ 
					subset.add(list.get(k)); 
				}


				mask = mask << 1;
			}


			result.add(subset);
		}
		return result;  
	}

}