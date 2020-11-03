package Assignment_01;

import java.util.Scanner;

public class one06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, c, area;
		r = sc.nextDouble();
		c = 2 * (22 / 7) * r;
		area = (22 / 7) * r * r;
		System.out.println("Area of circle" + area);
		System.out.println("Circumfance  of circle" + c);
sc.close();
	}

}
