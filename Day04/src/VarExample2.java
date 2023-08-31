
public class VarExample2 {

	public static void main(String args[]) {
		
		// 변수선언/할당(초기화)/사용
		// 1. 변수 선언 
		// 데이터타입 변수명; 
		// 2. 할당
		// 변수명 = 값; 
		// 3. 사용 
		// ex) System.out.println(변수명); .... 등등 
		
		String name = "이종석"; // 참조데이터타입(문자열-String) 
		int age = 46; // 기본데이터타입(정수-int) 
		
		final float PI = 3.14f; 
		final String dontChange = "바꾸지마";
		
		
		age = age - 10; // age = 46 - 10 사용 
		System.out.println("이름 : " + name + " 나이 " + age);
		
		System.out.println("제 이름은 이종석 \n\n\n\n\n\n 입니다.");
		System.out.println("나이는	xx입니다.");
		System.out.println("나이는\txx입니다.");
		//
		//제 이름은 "이종석" 입니다.
		String message = "제 이름은 \"이종석\" 입니다."; 
		System.out.println(message);
		
		String message2 = "리터럴은 \\로 시작합니다.(보통은)";
		System.out.println(message2);
		
		
		
		
	}
	
}
