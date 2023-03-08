package java101homeworks;

import java.util.Scanner;

public class F_VucutKitleİndeksiHesaplama {
	public static void main(String[] args) {
		double height, weight;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your height (in meters) : ");
		height = input.nextDouble();
		System.out.print("Enter your weight : ");
		weight = input.nextDouble();

		// Body Mass Index = weight(kg) / height(m) * height(m)
		double index = weight / (height * height);
		System.out.println("Your Body Mass Index : " + index);
	}
}
