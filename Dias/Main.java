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
        Calendar todaysDate = Calendar.getInstance();
        boolean continueLoop = true;
        int todaysDay = todaysDate.get(Calendar.DAY_OF_MONTH);
        int todaysMonth = todaysDate.get(Calendar.MONTH) + 1;
        int todaysYear = todaysDate.get(Calendar.YEAR);
        int bDateYear = 0;
        int bDateDay = 0;
        int bDateMonth = 0;
        int ageYears = 0;
        int ageDays = 0;
        int ageMonths = 0;
        int[] lastDayMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        do {
            try {
                System.out.println("Ingrese su año de nacimiento yyyy: ");
                bDateYear = keyboard.nextInt();
                if (bDateYear > todaysYear) {
                    throw new MyException("Ingrese un año correcto");
                }

                System.out.println("Ingrese su mes de nacimiento mm: ");
                bDateMonth = keyboard.nextInt();

                if (bDateMonth > 12 || bDateMonth < 1) {
                    throw new MyException("Ingrese un mes correcto");
                }

                System.out.println("Ingrese su día de nacimiento dd: ");
                bDateDay = keyboard.nextInt();

                if (getLeapYear(bDateYear)) {
                    lastDayMonth[1] = 29;
                    if (bDateDay > lastDayMonth[bDateMonth - 1]) {
                        throw new MyException("Ingrese un día correcto");
                    }
                } else if (bDateDay > lastDayMonth[bDateMonth - 1]) {
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
        ageYears = todaysYear - bDateYear;
        
        ageMonths = todaysMonth - bDateMonth;
        
        ageDays = todaysDay - bDateDay;
 

        if (ageDays < 0) {
            ageMonths--;
            if(bDateDay>todaysDay){
                ageDays = (lastDayMonth[todaysMonth - 2] - bDateDay) + todaysDay;
            }else{
                ageDays += lastDayMonth[todaysMonth-1];
            }
            
        }

        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }
        
    

        System.out.println("Usted tiene " + ageYears + " años, " + ageMonths + " meses y " + ageDays + " días.");
    }
}
