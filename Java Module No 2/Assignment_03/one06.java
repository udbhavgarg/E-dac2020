package Assignment_03;

import java.util.Scanner;
public class one06
{ 
	
static void thirdLargest(int arr[], 
                         int arr_size) 
{ if (arr_size < 3) 
    { 
        System.out.printf(" Invalid Input "); 
        return; 
    } 
   int first = arr[0]; 
    for (int i = 1; 
             i < arr_size ; i++) 
        if (arr[i] > first) 
            first = arr[i]; 
    int second = Integer.MIN_VALUE; 
    for (int i = 0;  
             i < arr_size ; i++) 
        if (arr[i] > second &&  
            arr[i] < first) 
            second = arr[i]; 
   int third = Integer.MIN_VALUE; 
    for (int i = 0;  
             i < arr_size ; i++) 
        if (arr[i] > third &&  
            arr[i] < second) 
            third = arr[i]; 
  
    System.out.println("The third Largest element is"+ third); 
} 
   
public static void main(String []args) 
{ 
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	sc.close();
    thirdLargest(a, n); 
} 
 
  
}

