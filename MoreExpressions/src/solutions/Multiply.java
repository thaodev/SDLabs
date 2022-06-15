package solutions;

import java.util.Scanner;

public class Multiply {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a whole number: ");
    int number = input.nextInt();
    System.out.println(number);
        
    System.out.print("Enter a whole number: ");
    number *= input.nextInt();
    System.out.println(number);
    
    System.out.print("Enter a whole number: ");
    number *= input.nextInt();
    System.out.println(number);
    
    System.out.print("Enter a whole number: ");
    number *= input.nextInt();
    System.out.println(number);
    
    System.out.print("Enter a whole number: ");
    number *= input.nextInt();
    System.out.println(number);
    
    input.close();
  }

}
