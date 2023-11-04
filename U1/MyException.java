import java.util.*;

public class MyException extends Exception {

    private int errorCode;

    public MyException(int errorcode) {
        this.errorCode = errorcode;
    }

    @Override
    public String getMessage() {
        return "MyException: Exception code " + errorCode;
    }

    public static void main(String[] args) {
        int number = 0;

        try {
            number = 25;

            if (number >= 0 && number <= 10) {
                throw new MyException(111);
            } else if (number > 10 && number <= 20) {
                throw new MyException(222);
            } else if (number > 20 && number <= 30) {
                throw new MyException(333);
            }
        } catch (MyException exception) {
            System.out.println(number);
            System.out.println(exception.getMessage());
        }
    }
}
