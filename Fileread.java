package com.Filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
		FileReader r=new FileReader("\\D:new.txt");
		int ch;
		while((ch=r.read())!=-1) {
			System.out.print((char)ch);
			
			
		}
		r.close();
		

	}

}
