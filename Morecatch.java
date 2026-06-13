package com.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Morecatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		int a = 5;
		int b = 0;
		try {
			FileReader f = new FileReader("E:\\Content Creation and editing\\text scripts\\PM_post2.txt");
			System.out.println("Fi🔥🔥🔥🔥");
			int c = a/b;
			System.out.println(c);
			System.out.println(arr[6]);
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thank you");
		}
	}
}