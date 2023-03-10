package java101homeworks;

import java.util.Scanner;

public class I_KullaniciGirisi {
	public static void main(String[] args) {
		String userName, password, password2;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your username : ");
		userName = input.nextLine();

		System.out.print("Enter your password : ");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("You are logged in !");
		} else if (userName.equals("patika") && !password.equals("java123")) {
			System.out.println(
					"Wrong password. Do you want to reset your password? Enter 0 if the answer is no, 1 if yes. ");
			int answer = input.nextInt();
			
			switch (answer) {
			case 0:
				System.out.println("The process has been terminated.");
			case 1:
				Scanner input1 = new Scanner(System.in);
				System.out.print("Enter a different password than your old password : ");
				password2 = input1.nextLine();
				if (password2.equals("java123") || password2.equals(password)) {
					System.out.print("Could not create password, please enter another password : ");
					return;
				} else {
					System.out.print("Password created");
				}
				break;
			default:
				System.out.println("Failed to login to the system.");
			}
		}
	}
}
