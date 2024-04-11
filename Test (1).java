package kiranTheAccountClass;

import java.util.*;
//import java.math.*;

public class Test {
	 public static void main (String[] args) {
	 Account account = new Account(1122, 20000);
	 Account.setAnnualInterestRate(4.5);

	 account.withdraw(2500);
	 account.deposit(3000);
	 System.out.println("Balance is " + account.getBalance());
	 System.out.println("Monthly interest is " +
	 account.getMonthlyInterest());
	 System.out.println("This account was created at " +
	 account.getDateCreated());
	 System.out.println("ID is " + account.getid());
	 
	 System.out.println("--------------------");
	 Account account1=new Account();
	 System.out.println("NEW_ID is " + account1.getid());
	 System.out.println("Balance is " +account1.getBalance());
	 System.out.println("Monthly interest is " + account1.getMonthlyInterest());
	 System.out.println("This account was created at " + account1.getDateCreated());
	 account1.deposit(10000);
	 System.out.println("Balance is " +account1.getBalance());
	 account1.withdraw(2000);
	 System.out.println("Balance is " +account1.getBalance());
	 }
	}
	class Account {
		
		private int id =0;
		private double balance =0;
		private static double annualInterestRate =0;
		private Date dateCreated = new Date();
		public String time;
		
		public Account()
		{
		setid();
		setbalance();
		setannualInterestRate();
		setDate();
		}
		
		public void setDate() {
			
			this.time =this.dateCreated.toString();
		}
		

		public void setannualInterestRate() {
			Account.annualInterestRate = 4.5;
			}

		public Account(int id, int balance) {
			// TODO Auto-generated constructor stub
			this.id=id;
			this.balance=balance;
			setDate(id);
		}
		
		public void setDate(int id)
		{
			Calendar c =Calendar.getInstance();
			c.set(Calendar.MONTH, 3);
			c.set(Calendar.DATE, 25);
			c.set(Calendar.YEAR, 2010);
			dateCreated=c.getTime();
			this.time =this.dateCreated.toString();
		}
		
		public void setid()
		{

			int min=1000;
			int max=9999;
			
			this.id=(int)(Math.random()*(max-min+1)+min);
		}
		
		public int getid()
		{
			return id;
		}
		
		public void setbalance()
		{
			this.balance=0;
		}
		public String getDateCreated() {
			return time;
		}

		public static void setAnnualInterestRate(double d) {
			annualInterestRate = d;
		}

		public void withdraw(int i) {
			
			this.balance= balance-i;
		}

		public void deposit(int i) {
			// TODO Auto-generated method stub
			this.balance= balance+i;
		}

		public double getBalance() {
			
			return balance;
		}

		public double getMonthlyInterest() {
			
			return annualInterestRate;
		}
	}
