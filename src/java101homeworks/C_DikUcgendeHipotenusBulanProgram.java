package java101homeworks;

import java.util.Scanner;

public class C_DikUcgendeHipotenusBulanProgram {
	  	public static void main(String[] args) {

		int a, b;
		double c, u, area;

		// Get the length of the vertical(a) and horizontal(b) sides from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st side of the triangle : ");
		a = input.nextInt();
		System.out.println("Enter the 2nd side of the triangle : ");
		b = input.nextInt();

		c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hypotenuse : " + c);

		// Perimeter of triangle 2 * u
		// u = (a + b + c) / 2
		u = (a + b + c) / 2;

		// Area of triangle : Area * Area = u * (u - a) * (u - b) * (u - c)

		area = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
		System.out.println("Area of triangle : " + area);
	}
}
