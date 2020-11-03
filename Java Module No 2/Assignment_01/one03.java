package Assignment_01;

import java.util.Scanner;

public class one03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y, z;
		y = x * x + 3 * x - 7;
		System.out.println("y" + y);
		y = x++ + ++x;
		System.out.println("y" + y);
		z = x++ - --y - --x + x++;
		System.out.println("x " + x);
		System.out.println("y " + y);
		System.out.println("z " + z);
		boolean a = false, b = true, c;
		c = a && b || !(a || b);
		System.out.println("x " + a);
		System.out.println("y " + b);
		System.out.println("z " + c);
sc.close();
	}
}
