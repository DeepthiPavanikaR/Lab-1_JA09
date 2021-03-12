package lab1;

import java.util.Scanner;

public class TrafficController {

	public static void main(String[] args) {
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		if (x == 'r')
			System.out.println("Stop");
		else if (x == 'y')
			System.out.println("Ready");
		else if (x == 'g')
			System.out.println("Go");

	}

}
