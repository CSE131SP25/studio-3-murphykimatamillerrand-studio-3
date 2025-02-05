package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please input a number");
		int n = in.nextInt();

		boolean[] array = new boolean[n];

		int one = 1;

		for (int i = 2; i < n + 1; i++) {

			for (int j = 2 * i; j < n; j = j + i) {

				array[j] = true;

			}

		}

		for (int z = 2; z < n; z++) {

			if (array[z] != true) {

				System.out.println(z);

			}

		}
	}
}