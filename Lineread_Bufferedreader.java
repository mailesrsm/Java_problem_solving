package com.Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lineread_Bufferedreader  {

	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new FileReader("D:\\new.txt"));
		String line;
		while((line=r.readLine())!=null) {
			System.out.println(line);
		}
		r.close();
	}

}
