import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {

	public static BigInteger fibonacci(int n) {

		if (n <= 1)
			return BigInteger.valueOf(n);

		BigInteger previous = BigInteger.ZERO, next = BigInteger.ONE, sum;

		for (int i = 2; i <= n; i++) {

			sum = previous;
			previous = next;
			next = sum.add(previous);
		}

		return next;
	}

	public static void Calculator() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");

		// nextDouble() reads the next double from the keyboard
		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = reader.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = first + second;
			break;

		case '-':
			result = first - second;
			break;

		case '*':
			result = first * second;
			break;

		case '/':
			result = first / second;
			break;
		// operator doesn't match any case constant (+, -, *, /)
		default:
			System.out.printf("Error! operator is not correct");
			return;
		}

		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter 1 for Calculator, 2 for Fibonacci: ");

		int input = reader.nextInt();
		
		if (input == 1)
			Calculator();
		
		
		else if (input == 2){
	        System.out.print("Enter n to be calculated: ");

	        // nextDouble() reads the next double from the keyboard
	        int n = reader.nextInt();
	        
	        for (int i = 0; i <= n; i++) {

	            BigInteger val = fibonacci(i);
	            System.out.println(val);
	        }
		}
		
		else
			System.out.println("Wrong Choice.");
	}
}
