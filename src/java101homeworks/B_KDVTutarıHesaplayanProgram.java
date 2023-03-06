package java101homeworks;

import java.util.Scanner;

public class B_KDVTutarıHesaplayanProgram {
	public static void main(String[] args) {

		double amount, vatRate, vatAmount, vatIncAmount;

		// Get amount from user
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the price amount : ");
		amount = input.nextDouble();

		vatRate = amount < 1000 ? 0.18 : 0.08;

		vatAmount = amount * vatRate;
		vatIncAmount = amount + vatAmount;

		System.out.println("Price without VAT : " + amount);
		System.out.println("VAT Rate : " + vatRate);
		System.out.println("VAT Amount : " + vatAmount);
		System.out.println("VAT Including Amount : " + vatIncAmount);		
	}	
}
