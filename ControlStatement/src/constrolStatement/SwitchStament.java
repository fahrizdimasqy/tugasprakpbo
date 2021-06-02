package constrolStatement;

import java.util.Scanner;

public class SwitchStament {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.print("Enter a number: ");
		int num1 = in.nextInt();
		System.out.print("Enter another number: ");
		int num2 = in.nextInt();
		System.out.print("Enter the opperand: ");
		char input = in.next().charAt(0);
		switch (input) {
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		case '%':
			answer = num1 % num2;
			break;
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		default:
			System.out.print("Invalid Command");
		}

		System.out.print("The result is: " + answer);
	}
}
