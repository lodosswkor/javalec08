// 인자를 제한없이 받는 방법 
// 1. 인자를 배열로 받기 
//     메서드명(데이터타입[] 변수명) 
// 2. 인자를 데이터타입 ... 변수명 으로 받기 
//     메서드명(데이터타입 ... 변수명) 

import java.util.Arrays;

public class MethodEx2 {
	
	static int getAddAll(int[] x) {
		int result = 0;
		for(int val : x) {
			result += val; 
		}
		return result; 
	}
	
	static void printAddAll(int ... x) { // 가변인자 
		int result = 0; 
		for(int val : x) {
			result += val;
		}
		System.out.println(result); 
	}
	
	// static void printAddAllDoubleParam(int ... x, String name) 
	// Error 가변인자는 무조건 맨 뒤에 선언 
	static void printAddAllDoubleParam(String name, int ... x) {
		System.out.println("나는 " + name + "입니다.");
		System.out.println("저한테 넘어온 int ...x 는");
		for( int i = 0; i < x.length; i ++) {
			System.out.print(x[i] + "\t"); 
		}
	}
	
	// 메서드를 선언
	// 메서드명은 sliceArray
	// 인자는 int[], int from  
	// 결과값 return int[] 
	// 실행문 인자로 받은 int[]의 from 인덱스 부터 끝까지의 
	// 배열값을 복제해서 return 해라. 
	// ex) 인자 int[] a = {1,2,3,4,5}; 
	// int[] b = sliceArray(a, 1); 
	// System.out.println(Arrays.toString(b)); --> {2,3,4,5}
	
	static int[] sliceArray(int[] x, int from) {
		int[] result = new int[x.length - from];
		int idx = 0; 
		for(;from < x.length; from++) {
			result[idx++] = x[from]; 
		}
		return result; 
	}

	
	

	public static void main(String[] args) {
		
		printAddAll(1,2,3,4,5,6,7,8,9); // int ... x 
									 // 가변인자 : 인자의 수를 제한하지 않음
		int[] param = {1,2,3,4,5,6,7,8,9};
		
		int result = getAddAll(param); // int[] x 
									// 배열인자 : 인자의수를 제한하지만, 그 값은 배열의
									// 길이 제한이 없다. 
		
		System.out.println(result);
		
		printAddAllDoubleParam("이종석",1,2,3,4,5,6,10); 

		int[] a = {1,2,3,4,5,6,7,8,9,10}; 
		int[] b = sliceArray(a, 2); 
		System.out.println();
		System.out.println(Arrays.toString(b)); // [3, 4, 5]
		// Arrays 맨 위에다가 import java.util.Arrays;
		
	}
	
}
