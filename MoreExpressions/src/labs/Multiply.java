package labs;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int number = 0;
		int multiple = 1;
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		System.out.println("You entered: " + number);
		while (count < 4) {
			System.out.println("Enter a number");
			number = sc.nextInt();
			multiple *= number;
			count++;
			
		}
		System.out.println(multiple);
	}

}
