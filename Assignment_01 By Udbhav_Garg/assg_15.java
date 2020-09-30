import java.util.Scanner;

public class assg_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j,k;
		i = sc.nextInt();
		j = sc.nextInt();
		
		System.out.println(i+" "+j);
		k=i;
		
		i=j;
		j=k;
		
		System.out.println(i+" "+j);
		sc.close();

}
}
