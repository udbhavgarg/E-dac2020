package Assignment_2;

public class Assg_2 {

	public static void main(String[] args) {
		int i, j,c=1;
		for (i = 0; i < 9; i++) {
			c=1;
			for (j = 9 - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print(c+++" ");
			}
			System.out.println();
			
		}
	}
}
