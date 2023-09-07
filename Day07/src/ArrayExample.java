import java.util.Arrays;

public class ArrayExample {

	public static void main(String args[]) {
	
		// 1. 배열을 선언하는 법. <- 배열공간(값이 들어갈 곳)을 만들지 않음. 
		int a[]; 
		int[] b; 
		//int d; 
		
		// 2. 선언과 동시에 초기화 
		int c[] = {1, 2, 3}; // 방3개 짜리 배열 변수  
		
		// 3. 선언 + 빈공간 할당 
		int[] d = new int[10];
		
		
		System.out.println("c변수에 2번째 방에 있는 값 - c[1]" + c[1]);
		c[0] = -10; 
		System.out.println("c[0] = " + c[0]);
		
		// ex 
		int x[] = {1,2,3,4,5,6,7,8}; 
		System.out.println(Arrays.toString(x)); // 배열의 모습을 한번에 보고 싶어요.  
		System.out.println("x[0]=" + x[0]);
		System.out.println("x[1]=" + x[1]);
		System.out.println("x[2]=" + x[2]);
		System.out.println("x[3]=" + x[3]);
		System.out.println("x[4]=" + x[4]);
		System.out.println("x[5]=" + x[5]);
		System.out.println("x[6]=" + x[6]);
		System.out.println("x[7]=" + x[7]);
		
		// Array Index Out of Bound Exception 발생 
		System.out.println("x[8]=" + x[8]);
		
		
		// hint - 배열의 index 는 배열 길이 - 1
		// 배열의 길이는 배열변수.length
		// for(초기값? 배열의 시작인덱스;초기변수가<배열길이;초기변수++)
		for( int idx = 0; idx < x.length; idx++) {
			System.out.println("x[ " + idx + " ] = " + x[idx]);
		}
		
		int idx2 = 0; 
		while( idx2 <= x.length - 1) {
			System.out.println("x[ " + idx2 + " ] = " + x[idx2]);
			idx2++;
		}
		
		// 향상된 for문 
		for(int val : x) {
			System.out.println(val); 
		}
		
		
	}
	
}
