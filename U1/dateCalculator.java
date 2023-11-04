import java.util.*;

public class dateCalculator extends Exception {
    private String errorCode;

    public dateCalculator(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode;
    }

    public static boolean getLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar actualDate = Calendar.getInstance();
        boolean continueLoop = true;
        int currentDay = actualDate.get(Calendar.DAY_OF_MONTH);
        int currentMonth = actualDate.get(Calendar.MONTH) + 1;
        int currentYear = actualDate.get(Calendar.YEAR);
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
                birthDateYear = input.nextInt();
                if (birthDateYear > currentYear || birthDateYear < 0) {
                    throw new dateCalculator("Ingrese un año correcto");
                }
                continueLoop = false;
            } catch (InputMismatchException charException) {
                System.out.println("Debe ingresar obligatoriamente número entero");
                System.out.println("\nError: " + charException);
                input.nextLine();
            } catch (dateCalculator miexception) {
                System.out.println(miexception.getMessage());
            }
        } while (continueLoop);

        continueLoop = true;
        do {
            try {
                System.out.println("Ingrese su mes de nacimiento mm: ");
                birthDateMonth = input.nextInt();

                if (birthDateMonth > 12 || birthDateMonth < 1) {
                    throw new dateCalculator("Ingrese un mes correcto");
                }
                continueLoop = false;
            } catch (InputMismatchException charException) {
                System.out.println("Debe ingresar obligatoriamente número entero");
                System.out.println("\nError: " + charException);
                input.nextLine();
            } catch (dateCalculator miexception) {
                System.out.println(miexception.getMessage());
            }
        } while (continueLoop);

        continueLoop = true;
        do {
            try {
                System.out.println("Ingrese su día de nacimiento dd: ");
                birthDateDay = input.nextInt();

                if (getLeapYear(birthDateYear)) {
                    lastDayMonth[1] = 29;
                    if ((birthDateDay > lastDayMonth[birthDateMonth - 1]) || birthDateDay <= 0) {
                        throw new dateCalculator("Ingrese un día correcto");
                    }
                } else if ((birthDateDay > lastDayMonth[birthDateMonth - 1]) || birthDateDay <= 0) {
                    throw new dateCalculator("Ingrese un día correcto");
                }
                continueLoop = false;
            } catch (InputMismatchException charException) {
                System.out.println("Debe ingresar obligatoriamente número entero");
                System.out.println("\nError: " + charException);
                input.nextLine();
            } catch (dateCalculator miexception) {
                System.out.println(miexception.getMessage());
            }
        } while (continueLoop);

        if (getLeapYear(currentYear)) {
            lastDayMonth[1] = 29;
        } else {
            lastDayMonth[1] = 28;
        }

        ageYears = currentYear - birthDateYear;

        ageMonths = currentMonth - birthDateMonth;

        ageDays = currentDay - birthDateDay;

        if (currentMonth == 1) {
            currentMonth = 13;
        }

        if (ageDays < 0) {
            ageMonths--;
            if (birthDateDay >= lastDayMonth[currentMonth - 2]) {
                ageDays = currentDay;
            } else {
                ageDays = (lastDayMonth[currentMonth - 2] - birthDateDay) + currentDay;
            }
        }

        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }

        System.out.println("Usted tiene " + ageYears + " años, " + ageMonths + " meses y " + ageDays + " días.");
    }
}