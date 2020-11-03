package Assignment_01;

import java.util.Scanner;

public class one11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
		sc.close();
	}
}
