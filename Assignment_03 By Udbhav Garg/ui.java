package Assignment_3;

import java.util.Scanner;

public class ui {

	public static void main(String[] args) {
		System.out.println(" Welcome to Fluffy Joe Bank");
		System.out.println(" Choose your activity");
		System.out.println("A/c :::  Creation , Withdrawl , Deposit , Show");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), s1;
		s = s.toUpperCase();
		Back_hand b = new Back_hand();

		int r = 0, cid = 0;

		switch (s) {
		case "CREATION":
			System.out.println("Enter your Name");
			s1 = sc.nextLine();
			System.out.println("Ammount you want to deposit");
			r = sc.nextInt();
			if (r < 0)
			{
			System.out.println("Invalid Input");
			break;
			}
			b.creation(s1, r);
			break;

		case "WITHDRAWL":
			System.out.println("Enter your Name");
			s1 = sc.nextLine();
			System.out.println("Enter your Customer Id");
			cid = sc.nextInt();
			System.out.println("Ammount you want to Withdraw");
			r = sc.nextInt();
			if (r < 0)
			{
			System.out.println("Invalid Input");
			break;
			}
			b.withdrawl(s1, r, cid);
			break;

		case "DEPOSIT":
			System.out.println("Enter your Name");
			s1 = sc.nextLine();
			System.out.println("Enter your Customer Id");
			cid = sc.nextInt();
			System.out.println("Ammount you want to deposit");
			r = sc.nextInt();
			if (r > 0)
			{
			System.out.println("Invalid Input");
			break;
			}
			b.deposit(s1, r, cid);
			break;

		case "SHOW":
			System.out.println("Enter your Name");
			s1 = sc.nextLine();
			System.out.println("Enter your Customer Id");
			cid = sc.nextInt();
			b.show(s1, cid);
			break;

		default:
			System.out.println("Invalid Input: Try Again");
			break;
		}
		sc.close();

	}
}
