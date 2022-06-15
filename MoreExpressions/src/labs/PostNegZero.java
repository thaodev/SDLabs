package labs;

import java.util.Scanner;

public class PostNegZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		double number = sc.nextDouble();
		String result = number >= 0 ? (number == 0) ? "zero" : "positive" : "negative";
		System.out.println(result);
	}

}
