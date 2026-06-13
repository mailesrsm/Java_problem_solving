package com.polymor;

public class Methodoverloading {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
