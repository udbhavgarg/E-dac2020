package Assignment_04;
import java.util.Scanner;
class Complex { 

	int real;
	int imaginary; 

	Complex() 
	{ 
	} 

	Complex(int real, int imaginary) 
	{ 
		this.real = real; 
		this.imaginary = imaginary; 
	} 

	Complex addComp(Complex C1, Complex C2) 
	{ 
		Complex temp = new Complex(); 
		temp.real = C1.real + C2.real; 
		temp.imaginary = C1.imaginary + C2.imaginary; 
		return temp; 
	} 
} 

public class four06 { 
		public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for 1st Real Part");
		int a=sc.nextInt();
		System.out.println("Enter the value for 1st Imaginary Part");
		int b=sc.nextInt();
		System.out.println("Enter the value for 2nd Real Part");
		int c=sc.nextInt();
		System.out.println("Enter the value for 2nd Imaginary Part");
		int d=sc.nextInt();
		sc.close();
		
		Complex C1 = new Complex(a,b ); 
		System.out.println("Complex number 1 : "+ C1.real + " + i"+ C1.imaginary); 
		
		Complex C2 = new Complex(c, d); 
		System.out.println("Complex number 2 : "+ C2.real + " + i"+ C2.imaginary); 
		Complex C3 = new Complex(); 
		
        C3 = C3.addComp(C1, C2); 
    	System.out.println("Sum of complex number : "+ C3.real + " + i"+ C3.imaginary); 
	} 
} 
