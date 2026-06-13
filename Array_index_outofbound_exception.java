	package com.exception;
	
	public class Array_index_outofbound_exception {
	
		public static void main(String[] args) {
			int[] arr= {10,20,30,40,50};
			try {
				System.out.println(arr[4]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());			
			}finally {
				System.out.println("Array index is out of value");
			}
	
		}
	
	}
