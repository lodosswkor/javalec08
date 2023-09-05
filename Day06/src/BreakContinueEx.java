import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String args[]) {
		
		
		byte b = (byte)128;
		System.out.println(b); 
		System.out.println(~b);
		
		byte c = 1;  
		System.out.println( (byte)(c << 7)); // => 1000000
		System.out.println(~(c << 7));  
		
		byte d = -1; // 1111 1111 
		System.out.println((byte)(d >>> 1));  // 0111 1111
		
		//-- 
		
		
		
		
		
		int command = 0; 
		
		for(;;) { // 무한루프 
			System.out.print("숫자를 입력하세요(프로그램 종료는 -) : ");
			Scanner in = new Scanner(System.in); 
			command = in.nextInt();
			if(command < 0) { // 사용자의 입력값이 음수이면 
				break; // 반복문을 끝내겠다
			}
			System.out.println("입력값은 " + command + "입니다."); 
		} // for loop문 끝 
		// <-- 
		System.out.println("프로그램 종료"); 
		
		
		// 코드상 break를 쓰는게, 밑에 break가 없는 
		// 문단보다 연산을 50% 적게합니다. 
		for(int i = 0; i < 10; i++) {
			if(i == 5) { 
				break; 
			}
			System.out.println(i);   // 0 ~ 4
		}
		
		for(int i = 0; i < 10 ; i++) {
			if(i < 5) {
				System.out.println(i); // 0 ~ 4 
			}
		}
		
		
	}
	
}
