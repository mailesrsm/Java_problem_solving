package com.Custom_Exception;

public class Mainclass {
	public static void main(String[] args) throws insufficientbalance {
		Bankaccount acc=new Bankaccount();
		acc.withdraw(7000);
	}

}
