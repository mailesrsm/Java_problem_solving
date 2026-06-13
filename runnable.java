package com.Multithread;
import java.io.*;
public class runnable implements Runnable {
	public void run() {
		System.out.println("Thread running");
	}

	public static void main(String[] args) {
		runnable t=new runnable();
		thread t1=new thread();
		t1.start();
		
		

	}

}
