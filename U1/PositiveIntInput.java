import java.util.*;

public class PositiveIntInput
{
	public static void main(String[] args) {
		int[] vector = {20,45,76,81,34,567,423,6,3,5};
		Scanner input = new Scanner(System.in);
		int index;
		boolean continueLoop = true;
		do{
		try
		{
		    System.out.print("Ingrese un valor entre 0 y 9: ");
		    index = input.nextInt();
		    
		    System.out.print("En el vector se almacena en la posicion " + index + " el valor " + vector[index]);
		    continueLoop = false;
		}
		catch(InputMismatchException charException)
		{
		    System.out.print("Debe ingresar obligatoriamente número entero");
		    System.out.print("\nError: " + charException);
		    input.nextLine();
		}
		catch(IndexOutOfBoundsException indexException){
		    System.out.println("El valor debe estar entre 0 y 9");
		    System.out.println("Error: " + indexException);
		}
		}while(continueLoop);
	}
}