package com.corejava.oops;

public class BankAccount {
	
	/*
	 * 
	 * ABSTRATCION:
			Hiding unwanted implementation from the end user and
			 only showing the implementation which are required to be shown to the end user..
	 */
	
	
	
	private int accountNumber;
	private int balance = 15000;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdrawAmount(int amount)
	{
		if(checkBalanceBeoforeWithdrawAndUpdate(amount))
		{
			System.out.println(" Please collect your cash .. Thanks..");
		}
		else
		{
			System.out.println(" You dont have sufficient balance.....");
		}
		
	}
	
	private boolean checkBalanceBeoforeWithdrawAndUpdate(int amount)
	{
		if (balance > amount)
		{
			balance = (balance - amount);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void depositCash(int amount)
	{
		System.out.println(" Thanks for depositing your amount.");
		updateBalanceOnDeposit(amount);
	}
	
	private void updateBalanceOnDeposit(int amount)
	{
		balance = balance + amount;
	}
	
	
	
	
	

}
