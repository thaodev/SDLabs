package Day3;

import java.util.Scanner;
/*
 * Remote Control Simulator
We are going to simulate a remote control. It will have buttons "0" to "9", "ON", and "OFF".

The program will print an initial message asking for input.

To begin, turn on the remote control:
If "ON" is pressed, output the message "TURNING ON...". (This output should be in a separate method.)

When the user enters ON, the remote control can accept number input. Nothing else happens unless the user enters ON - the program just waits for input.

Ask the user to enter the button to press. Accept the input. (This is a simulation, so the user will be typing the button name.)

Write a method named pressButton() that prints the message "BOOP!" to the screen. If the button is a number 0 through 9, call this method.

If some other non-existent button is pressed, output the message "Command not recognized."

The user can continue entering input until they type "OFF".

If "OFF" is pressed, output the message "TURNING OFF..." (again, separate method), and the program ends.
 */

public class RemoteControl {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("To begin, turn on the remote control: ");
		boolean isContinued = true;
		while (isContinued) {
			String input = sc.next();

			if (input.toUpperCase().equals("ON")) {
				turnOn();
				while (true) {
					System.out.println("Enter a button: ");
					String button = sc.next();
					if (button.matches("[0-9.]+")) {
						int buttonNumber = Integer.valueOf(button);
						if (buttonNumber >= 0 && buttonNumber <= 9) {
							pressButton();
						}
					} else {
						if (button.toUpperCase().equals("OFF")) {
							turnOff();
							isContinued = false;
							break;
						} else {
							invalidButton();
						}
					}

				}
			}
		}
	}

	private static void invalidButton() {
		System.out.println("Command not recognized");

	}

	private static void turnOff() {
		System.out.println("TURNING OFF..");

	}

	private static void turnOn() {
		System.out.println("TURNING ON..");
	}

	private static void pressButton() {
		System.out.println("BOOP!");
	}

}
