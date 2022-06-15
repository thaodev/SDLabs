package solutions;

import java.util.Scanner;

public class OddOrEven {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Read an int number from the user
    System.out.print("Enter a whole number: ");
    int number = input.nextInt();
    
    boolean isEven = number % 2 == 0;
    
    if (isEven) {
      System.out.println("Even.");
    }
    else {
      System.out.println("Odd.");
    }
    
    input.close();
  }

}
