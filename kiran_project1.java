package kiran_project;
import java.util.Scanner;
import java.lang.Math;
public class kiran_project1 {

	public static void main(String[] args) {

				
				 Scanner input = new Scanner(System.in);
			        double e;
			        
			        System.out.println("Enter investment amount: ");
			        double investmentamount = input.nextDouble();
			        System.out.println("Enter annual interest rate: ");
			        double annualinterestrate = input.nextDouble();
			        System.out.println("Enter number of years: ");
			        double numberofyears = input.nextDouble();
			        
			        double monthlyinterestrate;
			        annualinterestrate=(annualinterestrate/100);
			        monthlyinterestrate= (annualinterestrate/12)+1;
			        numberofyears= numberofyears*12;
			        
			        e=Math.pow(monthlyinterestrate,numberofyears);
			        
			        double b = investmentamount*e;
			        
			        System.out.println("Accumulated value is "+ b);
		input.close();
			}
		}
