import java.util.*;

public class assg_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long octal_num, decimal_num = 0;
		int i = 0;
		System.out.print("Input any octal number: ");
		octal_num = sc.nextLong();
		sc.close();
		while (octal_num != 0) {
			decimal_num = (long) (decimal_num + (octal_num % 10) * Math.pow(8, i++));
			octal_num = octal_num / 10;
		}
		System.out.print("Equivalent decimal number: " + decimal_num + "\n");
	}
}
