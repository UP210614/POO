import java.util.Scanner;

public class DivisionWithoutExceptions
{
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator;
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numerator entero: ");
		int numerator = input.nextInt();
		System.out.println("Introduce un denominator entero: ");
		int denominator = input.nextInt();
		
		int result = quotient(numerator,denominator);
	}
}