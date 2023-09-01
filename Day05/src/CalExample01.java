// 비트연산 
public class CalExample01 {

	public static void main(String args[]) {
		
		// 비트연산 - 2진수 연산 
		// true : 1 , false 0 
		// &, |, ^, ~
		
		int x = 10;
		int y = 7; 
		System.out.println("10 = " + Integer.toBinaryString(x));
		System.out.println("7 = " + Integer.toBinaryString(y));  
		
		// 1. x & y 
		System.out.println("x & y = " + (x & y));
		
		// 2. x | y 
		System.out.println("x | y = " + (x | y)); 
		
		// 3. x ^ y 
		System.out.println("x ^ y = "  + (x ^ y)); 
		
		// 4. not (~) 
		System.out.println("~ (x & y) = " + ~( x & y ));
		
		//int x1 = 2 * 2 * 2 * 2 * 2; // (2 5승); 
		int x1 = -1; 
		System.out.println(Integer.toBinaryString(x1));
		
		// << Left Shift 
		int r1 = x1 << 2; 
		System.out.println(Integer.toBinaryString(r1));
		
		System.out.println("Right Shift");
		// >> right shift 
		// byte 에서 2진수로 가장 작은값은 
		// 1000 0000 = -128
		// 가장큰값음? 
		// 0111 1111
		byte r2 = -128; 
		System.out.println(Integer.toBinaryString(r2));
		System.out.println(Integer.toBinaryString(r2 >> 2));
		
		r2 = 127; 
		System.out.println(Integer.toBinaryString(r2));
		System.out.println(Integer.toBinaryString(r2 >> 2));
		
		// >>> 이 친구는 우측이동시, 좌측에 있는 부호비트+나머지를 모두
		// 0으로 채워준다. 
		System.out.println("Right Shift >>> ");
	    r2 = -10; 
		System.out.println(r2 + "=" + Integer.toBinaryString(r2));
		System.out.println((r2 >>> 2) + "=" + Integer.toBinaryString(r2 >>> 2));
		
//		x = 2;
//		x = x * 2 * 2; // 2의 3승
//		
//		y = 2; 
//		y = y << 3; // 2의 3 
		
		int z1 = 10; 
		
		System.out.println("z1 = " + Integer.toBinaryString(z1)); 
		System.out.println("5 = " + Integer.toBinaryString(5)); 
		
		z1 &= 5; // z1 = z1 & 5;
		System.out.println("z1 & 5 = " + Integer.toBinaryString(z1)); 
		System.out.println("z1 & 5 = " + z1); 
		
		boolean b1 = true; 
		b1 &= ( z1 > 1 || z1 << 2 > 10);
		// b1 = b1 & ( z1 > 1 || z1 << 2 > 10);
		System.out.println(b1);
		
		
		// 3항 연산자. 
		
		int grade = 6; // 5학년  
		int age = 0; 
		
		age = grade == 5 ? 12 : -1;  // 3항연산 
		// 조건식 ? true일때 : false 일때; 
		
		System.out.println("학년 : " + grade + " 나이 : " + age); 
		
		age = age++ * 10;
	    System.out.println(age);
		age = ++age * 10;
	    System.out.println(age);
		
	}
	
}
