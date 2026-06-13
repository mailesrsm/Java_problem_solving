package com.basic;

public class Sphere implements Shapearea,Shapevolume{
	double radius=5.6;

	@Override
	public void calculate_volume() {
		
		double result=((4/3)*pi*radius*radius*radius);
		System.out.println("Volume of shpere is "+result);
		
	}

	@Override
	public void calculate_area() {
		// TODO Auto-generated method stub
		
	}
	}
	

