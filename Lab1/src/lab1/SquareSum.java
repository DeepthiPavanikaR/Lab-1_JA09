package lab1;

import java.util.Scanner;

public class SquareSum {
	public static int calculateDifference(int n) {
		int sum = 0, sqsum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			sqsum = sqsum + (i * i);
		}
		return sqsum - (sum * sum);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}
