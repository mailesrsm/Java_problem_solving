package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOexception {
	public static void main(String[]args) {
		try {
			FileReader s=new FileReader("‪D:\\java\\Core Java interview questions and answers .pdf");
			System.out.println("File opened");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}finally {
			System.out.println("Thank you for visiting our site👍👍👍");
		}
		
	}

}
