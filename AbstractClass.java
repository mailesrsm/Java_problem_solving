package com.abstraction;

public abstract class AbstractClass {
	public AbstractClass() {
		System.out.println("Inside abstract class constructor");
	// TODO Auto-generated constructor stub
		
}
	void print() {
		System.out.println("Inside print method in abstract class");
	}
	public abstract void display();
	public final void show() {
		System.out.println("Inside show()");
	}
	public static void main(String[]args) {
		AbstractChildClass ab=new AbstractChildClass();
		ab.display();
		ab.print();
		ab.show();
		
	}

}
