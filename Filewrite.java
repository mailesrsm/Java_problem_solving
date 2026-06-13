package com.Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		FileWriter a=new FileWriter("D:\\new.txt",true);
		a.write("\nHello chennai\n");
		a.write("\nHi bharathraj\n");
		a.close();
		
		
		

	}
}

