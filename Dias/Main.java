package Dias;

import java.util.*;

public class Main {

    public static boolean getLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Calendar actualDate = Calendar.getInstance();
        boolean continueLoop = true;
        int actualDay = actualDate.get(Calendar.DAY_OF_MONTH);
        int actualMonth = actualDate.get(Calendar.MONTH) + 1;
        int actualYear = actualDate.get(Calendar.YEAR);
        int birthDateYear = 0;
        int birthDateDay = 0;
        int birthDateMonth = 0;
        int ageYears = 0;
        int ageDays = 0;
        int ageMonths = 0;
        int[] lastDayMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        do {
            try {
                System.out.println("Ingrese su año de nacimiento yyyy: ");
                birthDateYear = keyboard.nextInt();
                if (birthDateYear > actualYear) {
                    throw new MyException("Ingrese un año correcto");
                }

                System.out.println("Ingrese su mes de nacimiento mm: ");
                birthDateMonth = keyboard.nextInt();

                if (birthDateMonth > 12 || birthDateMonth < 1) {
                    throw new MyException("Ingrese un mes correcto");
                }

                System.out.println("Ingrese su día de nacimiento dd: ");
                birthDateDay = keyboard.nextInt();

                if (getLeapYear(birthDateYear)) {
                    lastDayMonth[1] = 29;
                    if (birthDateDay > lastDayMonth[birthDateMonth - 1]) {
                        throw new MyException("Ingrese un día correcto");
                    }
                } else if (birthDateDay > lastDayMonth[birthDateMonth - 1]) {
                    throw new MyException("Ingrese un día correcto");
                }

                continueLoop = false;
            } catch (InputMismatchException charException) {
                System.out.println("Debe ingresar obligatoriamente número entero");
                System.out.println("\nError: " + charException);
                keyboard.nextLine();
            } catch (MyException miexception) {
                System.out.println(miexception.getMessage());
            }
        } while (continueLoop);

        
        //Contar dias
        ageYears = actualYear - birthDateYear;
        
        ageMonths = actualMonth - birthDateMonth;
        
        ageDays = actualDay - birthDateDay;
 

        if (ageDays < 0) {
            ageMonths--;
            if(birthDateDay>actualDay){
                ageDays = (lastDayMonth[actualMonth - 2] - birthDateDay) + actualDay;
            }else{
                ageDays += lastDayMonth[actualMonth-1];
            }
            
        }

        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }
        
    

        System.out.println("Usted tiene " + ageYears + " años, " + ageMonths + " meses y " + ageDays + " días.");
    }
}
