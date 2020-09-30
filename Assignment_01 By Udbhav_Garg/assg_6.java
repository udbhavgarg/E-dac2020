

import java.util.Scanner;

public class assg_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		i = sc.nextInt();
		j = sc.nextInt();
		sc.close();
		System.out.println(i + " + " + j + " = " + (i + j));
		System.out.println(i + " - " + j + " = " + (i - j));
		System.out.println(i + " X " + j + " = " + (i * j));
		System.out.println(i + " / " + j + " = " + (i / j));
		System.out.println(i + " mod " + j + " = " + (i % j));
	}
}
