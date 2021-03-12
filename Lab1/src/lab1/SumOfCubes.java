package lab1;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = 0;
		while (number > 0) {
			int t = number % 10;
			int cube = t * t * t;
			sum = sum + cube;
			counter = counter + 1;
			number = number / 10;
		}
		System.out.println("Sum of Cubes of digit of a number " + sum);

	}

}
