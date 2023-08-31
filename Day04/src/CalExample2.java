
public class CalExample2 {
	
	public static void main(String args[]) {
		
		// 1. And 연산 양쪽 모두다 true 여야지 true / 그 외에는 모두 false
		// A && B , A & B 
		System.out.println("true && true = " + (true && true));
		
		int a = 10;
		int b = 20; 
		boolean result = a > 5 && b < 21 && ( a + 10 < 0); 
		// --> result = false / ( true && true ) && false 
		
		// 2. OR 연산자 양쪽 피연산자 중 하나만 true면 true.
		// A || B , A | B 
		result = a > 5 || b < 21 || ( a + 10 < 0);
		// --> result = true / ( true || true ) && false 
		
		// 3. XOR 연산자 양쪽 중 하나만 true일때 true 
		// A ^ B 
		result = a > 5 ^ b < 21 ^ ( a + 10 < 0);
		// --> result = false => ( true ^ true ) ^ false 
		System.out.println(result); 
		
		result = !result; // not false -> true
		
		// !) &&, & / ||, |의 차이 
		int x = 100; 
		int y = 110; 
		boolean z = x > y && ++x == 101; 
		// z가 y보다 크'고', ++x 가 101과 같냐? 
		// &&는 선피연산자 false일 경우, 후 피연산자는 계산할 필요도 
		// 없이 false이기 때문에 연산을 수행하지 않아서, 위의 경우는 x=100이 됨
		
		System.out.println("z = " + z);
		System.out.println("x = " + x); 
		
		z = x < y || ++x == 101;
		// x가 y보다 작'거나' ++x가 101과 같냐? 
		// ||는 선 피연산자가 true일 경우, 후 피연산자는 계산할 필요없이
		// true 이기 때문에 연산을 수행하지 않는다. 

		System.out.println("z = " + z);
		System.out.println("x = " + x); 
		
		
	}

}