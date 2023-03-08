package java101homeworks;

import java.util.Scanner;

public class E_DaireAlanCevreveDiliminiHesaplayanProgram {
	public static void main(String[] args) {

		int r, angle = 0;
		double pi = 3.14;
		angle = (angle < 361) ? angle : (angle % 360);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		r = input.nextInt();
		System.out.println("Enter the angle of the circle segment : ");
		angle = input.nextInt();

		// Area = π * r * r;
		// Perimeter = 2 * π * r;
		// Segment = (pi * (r * r) * a) / 360

		double area = pi * r * r;
		double perimeter = 2 * pi * r;
		double segment = (pi * (r * r) * angle) / 360;

		System.out.println("Area of the circle : " + area);
		System.out.println("Perimeter of the circle :" + perimeter);
		System.out.println("Area of the circle segment : " + segment);
	}
}
