package main.nomal.divisor;

import java.util.ArrayList;

public class Divisor {

	public static ArrayList<Integer> doProcess(int number) {

		ArrayList<Integer> divisors = new ArrayList<>();
		divisors.add(1);

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				divisors.add(i);
			}
		}

		divisors.add(number);
		return divisors;
	}

}
