package com.basic;

public class Square implements Shapevolume{
	double radius=4;

	@Override
	public void calculate_volume() {
		double result=radius*radius;
		System.out.println(result);
		
	}
	
	
}
