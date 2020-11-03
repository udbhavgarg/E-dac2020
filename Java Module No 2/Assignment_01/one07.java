package Assignment_01;

import java.util.*;

public class one07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double marks[] = new double[5];
		int i;
		double sum = 0;
		for (i = 0; i < 5; i++) {
			marks[i] = sc.nextDouble();
			sum = marks[i] + sum;
		}
		System.out.println("Percentage of the given student is" + (int) (sum / i) + "%");
		sc.close();
	}
}
