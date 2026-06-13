package com.Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wordbyword {

	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new FileReader("D:\\new.txt"));
		String line;
		while((line=r.readLine())!=null) {
			String[] arr=line.split(" ");
			for(String a:arr) {
			System.out.println(a);
			}
		}
		
		r.close();
		

	}

}
