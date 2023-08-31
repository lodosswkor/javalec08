
public class DataTypeExample {

	public static void main(String args[]) {
		
		// 자바의 변수 데이터타입은 크게 2가지 
		// a) 기본타입 b) 참조타입 
		
		// 작게 4가지가 있다. 
		// a) 정수 b) 실수 c) 논리 (기본타입 primitive type) 
		// / d) 참조 
		
		//평수 이름; 
		// 1바이트의 정수형, age를 선언해 봅시다. 
		byte age; // -> 메모리에 1byte공간이 생기고 - 이름을 age로 지었다.
		age = 10; // -> 할당(값)
		//age = age + 10; //<-- 왜 에러지? 기본적으로 숫자(정수)를 
		                        // 사용하게 되면, 그 정수는 int 인식(4bytes) 
								// 연산의 결과도 마찬가지로 int 
		System.out.println(age); //--> 사용 
		
		
		long b = 100; 
		b = age + 100; // long 8 bytes = age + 100 (int 4bytes) 
							   // 에러가 안남 
		
		
		char charValue = 65;
		System.out.println("65 = " + charValue);
		
		
		float a = 1.1f; // 실수형의 기본데이터타입은 double 이기 때문에
							  // float 변수에 실수를 넣을때는 f 를 사용해서
							  // "이친구는 float야 라고 컴파일러에게 알려줘야합니다. 
		
		double a2 = 100.0; // 소숫점(실수)는 기본 double 이기 때문에
									  // f 없이도 사용가능 
		
		boolean isName = true; // false 
		// 일반적으로 언어에서 0을 거짓 = false 
		// 0외의 모든 수는 true
		
		
		// 상수와 변수 차이 
		
		int address1 = 100;
		address1 = 200; 
		
		int address3; 
		// 블라블라블라 
		address3 = 100; 
		
		// 상수
		final int address2 = 100; // 상수는 일반적으로 선언과 동시에
											  // 값 할당 
		
		//address2 = 100-100;        // (에러)한번 값이 할당 되면, 변경 불가 
		//상수명은 일반적으로 모두 대문자를 사용
		
		// hello world 라는 변수명을 선언할때 -> int helloWorld
		// hello world 라는 상수는을선언할때  -> final int HELLOWORLD; 
		final int HELLO_WORLD = 100; 
		
		
		// 상수로 키패드 (ex) 
		final int ARROW_UP = 100; 
		final int ARROW_DOWN = 200; 
		
		int x = 10; 
		x = 10 + 100; 
	}
	
}
