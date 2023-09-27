package Dias;

public class MyException extends Exception {
    private String errorCode;
    
    public MyException(String errorCode){
        this.errorCode = errorCode;
    }
    
    @Override
    public String getMessage()
    {
        return errorCode;
    }
}

