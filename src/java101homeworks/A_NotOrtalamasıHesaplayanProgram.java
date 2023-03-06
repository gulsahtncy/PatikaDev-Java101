package java101homeworks;

import java.util.Scanner;

public class A_NotOrtalamasıHesaplayanProgram {
	public static void main(String[] args) {

        // Create variables
		int math, physics, turkish, history, music;

        Scanner input = new Scanner(System.in);

        // Get values from user
        System.out.print("Enter your math grade : ");
        math = input.nextInt();

        System.out.print("Enter your physics grade : ");
        physics = input.nextInt();

        System.out.print("Enter your turkish grade : ");
        turkish = input.nextInt();

        System.out.print("Enter your history grade : ");
        history = input.nextInt();

        System.out.print("Enter your music grade : ");
        music = input.nextInt();

        int total = (math + physics + history + turkish + music);
        double average = total / 6.0;

        System.out.println("Average : " + average);
        String result = average > 60 ? "Passed the Class" : "Failed in Class";
        System.out.print(result);
    }
}
