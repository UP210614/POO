public class NegativeArrayExample
{
	public static void main(String[] args) {
		try 
		{
		 int negativeSize = -5;
		 int[] array = new int[negativeSize];
		 
		} 
		catch(NegativeArraySizeException negativeArraySizeException) 
		{
		    System.out.println("Se produjo una excepcion NegativeArraySizeException:"); 
		    System.out.println(negativeArraySizeException.getMessage()); 
		    negativeArraySizeException.printStackTrace(); 
		}
	}
}