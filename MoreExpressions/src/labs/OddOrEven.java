package labs;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int number = sc.nextInt();
		String result = number % 2 == 0 ? "true" : "false";
		System.out.println(result);
		
	}
}
