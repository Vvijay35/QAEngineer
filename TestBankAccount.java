package com.corejava.oops;

public class TestBankAccount {

	public static void main(String[] args) {
	
		
		BankAccount b1 = new BankAccount();
		b1.setAccountNumber(12345);
		
		System.out.println(b1.getBalance());
		
		b1.withdrawAmount(5000);	
		
		System.out.println(b1.getBalance());
		
		
		b1.depositCash(20000);
		
		System.out.println(b1.getBalance());
		
		b1.withdrawAmount(10000);
		
		System.out.println(b1.getBalance());
		
		
	}

}
