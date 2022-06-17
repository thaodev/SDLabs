package day4;

public class Fibonacci {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + ": " + fibonaci(i));
		}
	}

	private static int fibonaci(int num) {
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			for (int i = 2; i <= num; i++) {
				sum = num1 + num2;
				num1 = num2;
				num2 = sum;
			}
		}
		return sum;
	}

}
