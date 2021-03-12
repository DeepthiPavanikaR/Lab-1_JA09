package lab1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 System.out.println("Enter the number:");
		    Scanner sc = new Scanner(System.in);
		       int n = sc.nextInt();
		       int a =1,b=1;
		       int c = a+b;
		       if(n==1 || n==2)
		        System.out.println("Fibonacci number is "+a);
		       else if(n>2) {
		       for(int i = 3 ;i<n;i++)
		       {
		        a=b;
		        b=c;
		        c=a+b;
		          }
		       System.out.println("Fibonacci number is "+c);
		       }

	}

}
