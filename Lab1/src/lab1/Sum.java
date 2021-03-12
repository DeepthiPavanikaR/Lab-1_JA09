package lab1;

import java.util.Scanner;

public class Sum {
	static int calculateSum(int N) {
		int i, sum = 0;
		for (i = 0; i < N; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(calculateSum(N));
	}

}
