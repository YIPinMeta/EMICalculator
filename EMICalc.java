package day4;

import java.util.Scanner;

public class EMICalc {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter loan amount in USD");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter annual interest rate (in %");
		double annualInterestRate= scanner.nextDouble();
		
		System.out.println("Enter loan tenure in yrs");
		int tenureYrs=scanner.nextInt();
		
		int tenureMonths= tenureYrs*12;
		
		double monthlyInterestRate = annualInterestRate/(12*100); //Value of r

		double emi= (principal*monthlyInterestRate*Math.pow( 1+ monthlyInterestRate, tenureMonths))
	/(Math.pow(1+ monthlyInterestRate, tenureMonths)) / (Math.pow(monthlyInterestRate, tenureMonths) -1);
	
	System.out.println("Your monthly EMI is: " +emi);

}
}