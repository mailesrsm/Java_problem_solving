package com.Checked_Exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Throws {
	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	static void m1() throws FileNotFoundException,ArithmeticException{
		FileReader f = new FileReader("D:\\new.txt");
		System.out.println("File opened");
	}
}