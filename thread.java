package com.Multithread;
import java.io.*;
public class thread extends Thread {
	public void run() {
		System.out.println("Thread running");
	}

	public static void main(String[] args) {
		thread t=new thread();
		thread t1=new thread();
		t.start();
		t1.start();
		
		

	}

}
