package Assignment_05;

import java.util.Scanner;

public class five01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s+' ';
		s = s.toUpperCase();
		int i, vc = 0, cc = 0, nc = 0, spc = 0, j;
		String s1 = "", s2 = "";

		for (j = 0; j < s.length(); j++) {
			if (s.charAt(j) == ' ') {

				try {

					int a = Integer.parseInt(s2);
					nc++;

				} catch (Exception e) {
					s1 = s2;
					s2 = "";
					char ch[] = s1.toCharArray();
					for (i = 0; i < ch.length; i++) {
						if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
							vc++;
						} else if ((int) ch[i] < 65) {
							if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4'
									|| ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
								nc++;
							} else
								spc++;
						} else
							cc++;

					}
				}
			}

			else
				s2 = s2 + s.charAt(j);

		}

		System.out.println("Vowels" + vc);
		System.out.println("Not Vowels" + cc);
		System.out.println("Nums" + nc);
		System.out.println("Spc Char" + spc);
sc.close();

	}
}
