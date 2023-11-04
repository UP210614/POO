import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithExceptions {
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		do {
			try {
				System.out.print("Introduce un numerador entero: ");
				int numerator = input.nextInt();
				System.out.print("Introduce un denominador entero: ");
				int denominator = input.nextInt();
				int operationResult = quotient(numerator, denominator);
				System.out.printf("\nResultado: %d / %d = %d \n", numerator, denominator, operationResult);
				continueLoop = false;
			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("\n Excepcion %s \n", inputMismatchException);
				input.nextLine();
				System.out.println("Debe introducir enteros. Intente de nuevo. \n");
			} catch (ArithmeticException arithmeticException) {
				System.err.printf("\nExcepcion %s\n", arithmeticException);
				System.out.println("Cero es un denominador invalido. Intente de nuevo.\n");
			}
		} while (continueLoop);
	}
}