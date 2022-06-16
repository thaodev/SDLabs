package Day3;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				int randomNum = (int) (Math.random() * 20);
				System.out.println("Random number is " + randomNum);
				String response = "yes";

				do {
				
					System.out.println("Please guess a random number between 1 and 20");
					int guessNumber = sc.nextInt();

					String result = null;
					result = (guessNumber >= randomNum)
							   ? (guessNumber == randomNum)
							   ? "equal" 
						       : "greater" 
						       : "smaller";
					
//					if (guessNumber >= randomNum) {
//						if (guessNumber == randomNum) {
//							result = "equal";
//						} else {
//							result = "greater";
//						}
//					} else {
//						result = "smaller";
//					}

					while (!result.equals("equal")) {

						System.out.println("Your guess is " + result + " than the random number.");
						System.out.println("Please try again.");
						guessNumber = sc.nextInt();
						result = (guessNumber >= randomNum)
								   ? (guessNumber == randomNum)
								   ? "equal" 
							       : "greater" 
							       : "smaller";
						
					}

					System.out.println("You guessed correctly. Would you like to play again?");

					response = sc.next();
				} while (response.equals("yes"));
				System.out.println("Good Bye. Thank you for playing!");

			}



}


