package Assignment_3;

public class Back_hand {

	String b_d[] = new String[20];
	int bal[] = new int[20];

	void creation(String s, int r) {

		b_d[0] = "Alpha";
		b_d[1] = "Beta";
		b_d[2] = "Gamma";
		b_d[3] = "Romeo";
		b_d[4] = "Jack";
		b_d[5] = "Rick";
		b_d[6] = "Liz";
		bal[0] = 4647;
		bal[1] = 4642;
		bal[2] = 4472;
		bal[3] = 16472;
		bal[4] = 124472;
		bal[5] = 2246472;
		bal[6] = 21246472;

		
		
		
		int i;
		for (i = 0; i < 20; i++) {
			if (b_d[i] == null) {
				b_d[i] = s;
				bal[i] = r + 500;
				System.out.println("Account Created");
				System.out.println("Account No  " + i);
				System.out.println("Balance is  Rs." + bal[i]);
				break;
			}

		}
	}

	void withdrawl(String s, int r, int c) {

		b_d[0] = "Alpha";
		b_d[1] = "Beta";
		b_d[2] = "Gamma";
		b_d[3] = "Romeo";
		b_d[4] = "Jack";
		b_d[5] = "Rick";
		b_d[6] = "Liz";
		bal[0] = 4647;
		bal[1] = 4642;
		bal[2] = 4472;
		bal[3] = 16472;
		bal[4] = 124472;
		bal[5] = 2246472;
		bal[6] = 21246472;

		if (b_d[c].equalsIgnoreCase(s)) {
			if ((bal[c] - r) > 500) {
				bal[c] = bal[c] - r;
				System.out.println("Withdrawl Sucessful  ");
				System.out.println("Remaning Balance is  Rs." + bal[c]);
			} else {
				System.out.println("Withdrawl Un-Sucessful Insuffecient Balance");
			}

		}

	}

	void deposit(String s, int r, int c) {

		b_d[0] = "Alpha";
		b_d[1] = "Beta";
		b_d[2] = "Gamma";
		b_d[3] = "Romeo";
		b_d[4] = "Jack";
		b_d[5] = "Rick";
		b_d[6] = "Liz";
		bal[0] = 4647;
		bal[1] = 4642;
		bal[2] = 4472;
		bal[3] = 16472;
		bal[4] = 124472;
		bal[5] = 2246472;
		bal[6] = 21246472;

		if (b_d[c].equalsIgnoreCase(s)) {
			bal[c] = bal[c] + r;
			System.out.println("Deposit Sucessful");
			System.out.println("Balance is  Rs." + bal[c]);
		} else {
			System.out.println("Cannot find your Account Details");
		}

	}

	void show(String s, int c) {

		b_d[0] = "Alpha";
		b_d[1] = "Beta";
		b_d[2] = "Gamma";
		b_d[3] = "Romeo";
		b_d[4] = "Jack";
		b_d[5] = "Rick";
		b_d[6] = "Liz";
		bal[0] = 4647;
		bal[1] = 4642;
		bal[2] = 4472;
		bal[3] = 16472;
		bal[4] = 124472;
		bal[5] = 2246472;
		bal[6] = 21246472;

		if (b_d[c].equalsIgnoreCase(s)) {
			System.out.println("Account Holder " + b_d[c]);
			System.out.println("Balance is Rs. " + bal[c]);
			System.out.println("Customer Id " + c);
		} else {
			System.out.println("Cannot find your Account Details");
		}

	}

}
