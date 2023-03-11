package java101homeworks;

import java.util.Scanner;

public class J_SinifiGecmeDurumu {
	public static void main(String[] args) {
		int math, physics, turkish, chemistry, music, numberOfLessons = 0, classScores = 0;
		double average;

		Scanner input = new Scanner(System.in);

		System.out.print("Math grade : ");
		math = input.nextInt();
		if (math >= 0 && math <= 100) {
			classScores += math;
			numberOfLessons++;
		}

		System.out.print("Physics grade : ");
		physics = input.nextInt();
		if (physics >= 0 && physics <= 100) {
			classScores += physics;
			numberOfLessons++;
		}

		System.out.print("Turkish grade : ");
		turkish = input.nextInt();
		if (turkish >= 0 && turkish <= 100) {
			classScores += turkish;
			numberOfLessons++;
		}

		System.out.print("Chemistry grade : ");
		chemistry = input.nextInt();
		if (chemistry >= 0 && chemistry <= 100) {
			classScores += chemistry;
			numberOfLessons++;
		}

		System.out.print("Music grade : ");
		music = input.nextInt();
		if (music >= 0 && music <= 100) {
			classScores += music;
			numberOfLessons++;
		}

		if (numberOfLessons != 0) {
			average = (classScores / numberOfLessons);
		} else {
			average = 0;
		}
		System.out.println("Your average : " + average);

		if (average <= 55) {
			System.out.println("You failed the class.");
		} else {
			System.out.println("Congratulations, you passed the class.");
		}
	
	}
}
