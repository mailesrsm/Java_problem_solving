package com.Array_operations;

import java.util.Scanner;

public class Allzeros_toend {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the values of array");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
		}
		}
		System.out.println("The zeros are moved to the end : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
