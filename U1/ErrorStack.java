public class ErrorStack {
	public static void main(String[] args) {
		
		try {
			method1();
		}

		catch (Exception exception) 
		{
			System.err.printf("%s\n\n", exception.getMessage());
			exception.printStackTrace(); 

			
			StackTraceElement[] trackElements = exception.getStackTrace();

			System.out.println("\nRastreo de la pila getStackTrace: ");
			System.out.println("Clase\t\t\tArchivo\t\t\tLinea\tMetodo");

			
			for (StackTraceElement element : trackElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s\n", element.getMethodName());
			}
		}
	}

	public static void method1() throws Exception {
		method2();
	}

	public static void method2() throws Exception {
		method3();
	}

	public static void method3() throws Exception {
		throw new Exception("La exception se lanzo en metodo3");
	}
}
