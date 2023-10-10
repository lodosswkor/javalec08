class Math01 {
	int divide(int x, int y) throws ArithmeticException {
		
		if( y == 0 ) throw new ArithmeticException("못 나워 0으론");
		return x / y; // y = 0이면 Exception 발생하겠죠?  
	
	}
}

public class ExceptionEx03 {

	public static void main(String args[])  {
		Math01 m = new Math01(); 
		int b = 0; 
		try {
			b = m.divide(10, 0);
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(b); 
	}
	
}
