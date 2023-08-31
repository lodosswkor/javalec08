
public class CalExample {

	public static void main(String args[]) {
		
		// 1. 대입 
		int x = 10;
		int y = 2; 
		
		// 2. 산술연산 
		// +,-,*,/,%  
		int result = 0;
		
		result = x + y;  // 덧셈 
		System.out.println("x + y = " + result);
		
		result = x - y; // 뺄샘 
		System.out.println("x - y = " + result);
		
		result = x * y; // 곱하기 
		System.out.println("x * y = " + result);
		
		result = x / y; // 나누기 
		System.out.println("x / y = " + result); 
		
		result = x % y; // 나머지 연산 
		System.out.println("x % y = " + result); 
		
		
		// 대입연산자가 산술연산자랑 같이 쓰이는 경우 
		int z = 10; 
		 
		z += 20; // z = z + 20;
		z -= 20; // z = z - 20; 
		z *= 20; // z = z * 20;
		z /= 20; // z = z / 20;
		z %=20; // z = z % 20; 
		
		// 증감연산자 
		// ++, -- , 단항연산자
		
		int x1 = 10; 
		++ x1; // x1 = x1 + 1; 
		-- x1; // x1 = x1 - 1;

		int z1 = 10; 
		//System.out.println(++z1);
		System.out.println(z1++);
		
	}
	
}
