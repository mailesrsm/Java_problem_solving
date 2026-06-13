package com.hashset;

import java.util.TreeSet;

public class Remove_duplicates {

	public static void main(String[] args) {
		int[] num= {1,1,2,2,5,6,8,9,3,7,8,7,8,9,3,4,3,4,4,5,6,6};
		TreeSet<Integer> a=new TreeSet<Integer>();
		for(int i=0;i<num.length;i++) {
			a.add(num[i]);
		}
		System.out.println(a);
	}

}
