package java101homeworks;

import java.util.Scanner;

public class G_ManavKasaProgramı {
	public static void main(String[] args) {
		// price perKG
		double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5.0, total;

		Scanner input = new Scanner(System.in);
		System.out.print("How Many Kilos of Pear? : ");
		double pearKg = input.nextDouble();
		System.out.print("How Many Kilos of Apples? : ");
		double appleKg = input.nextDouble();
		System.out.print("How Many Kilos of Tomatoes? : ");
		double tomatoesKg = input.nextDouble();
		System.out.print("How Many Kilos of Banana? : ");
		double bananaKg = input.nextDouble();
		System.out.print("How Many Kilos of Eggplant? : ");
		double eggplantKg = input.nextDouble();

		total = (pear * pearKg) + (apple * appleKg) + (tomatoes * tomatoesKg) + (banana * bananaKg)
				+ (eggplant * eggplantKg);
		System.out.println("Total amount : " + total);
	}
}
