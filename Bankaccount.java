package com.Custom_Exception;

public class Bankaccount {
		  
		  double balance = 30000;
		  void withdraw(double amount) throws insufficientbalance{
			  if(balance<amount) {
				  throw new insufficientbalance("Insufficient Balance");
			  }
			  balance-=amount;
			  System.out.println(balance+"Withdraw successfully");

}
}
