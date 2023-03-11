package java101homeworks;

import java.util.Scanner;

public class K_HavaSicakliginaGoreEtkinlikOnerme {
	public static void main(String[] args) {
		int temperature;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the air temperature : ");
		temperature = input.nextInt();
		
		if (temperature < 5) {
			System.out.println("You can ski.");
		}
		
		if (temperature > 5 && temperature < 15) {
			System.out.println("You can cinema.");			
		}
		
		if (temperature > 10 && temperature < 25) {
			System.out.println("You can picnic.");
		}
		
		if (temperature > 25) {
			System.out.println("You can swim.");
		}		
	}
}
