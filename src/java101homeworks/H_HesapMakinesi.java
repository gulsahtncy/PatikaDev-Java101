package java101homeworks;

import java.util.Scanner;

public class H_HesapMakinesi {
	public static void main(String[] args) {
		int number1, number2, select;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		number1 = input.nextInt();
		System.out.print("Enter the second number : ");
		number2 = input.nextInt();

		System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division ");
		System.out.print("What is your choice? : ");
		select = input.nextInt();

		switch (select) {
		case 1: {
			System.out.println("Addition : " + (number1 + number2));
			break;
		}
		case 2: {
			System.out.println("Subtraction : " + (number1 - number2));
			break;
		}
		case 3: {
			System.out.println("Multiplication : " + (number1 * number2));
			break;
		}
		case 4: {
			switch (number2) {
			case 0:
				System.out.println("The number cannot be divided by 0.");
				break;
			default:
				System.out.println("Division : " + (number1 / number2));
			}
			break;
		}
		default:
			System.out.println("Error : invalid status");
		}
	}
}
