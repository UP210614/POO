package Dias;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.println("Ingresa un nunmero: ");
        int numero = input.nextInt();
        input.close();
        if(numero < 0 ){
            throw new MyException("Introduzca un numero mayor que 0");
        }
        System.out.println("Su numero " + numero);
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("Ingrese un numero");
        }
        catch(MyException myException){
            System.out.println(myException);
        }
        
        
    }
}
