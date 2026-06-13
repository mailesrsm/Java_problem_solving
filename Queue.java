package com.hashset;

import java.util.Map;
import java.util.TreeMap;

public class Queue {

	public static void main(String[] args) {
		Map<String,Integer> m3=new TreeMap<String, Integer>();
		m3.put("bharathraj", 10);
		m3.put("akash", 20);
		m3.put("ashok", 30);
		m3.put("veera", 40);
		m3.put("chennai", null);
		System.out.println("Treemap m3"+m3);

	}

}
