package java101homeworks;

import java.util.Scanner;

public class D_TaximeterProgram {
	public static void main(String[] args) {		
		int km;
		double perKm = 2.20, total = 10, startPrice = 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in km : ");
		km = input.nextInt();
		
		total += (km * perKm);
		System.out.println(total);
	}
}
