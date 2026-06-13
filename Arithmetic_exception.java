package com.exception;
import java.util.Scanner;
public class Arithmetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		try {int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
		}

	}

}
