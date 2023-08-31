
public class CastingExample {

	public static void main(String args[]) {
		
		// 1. 묵시적(자동) 형변환
		byte a1 = 10; // 1byte 
		int b1 = a1; 
		
		// 2. 명시적(강제) 형변환 
		a1 = (byte)b1; 
		//a1 = (byte)b1 + (byte)20;  // 정수 연산의 결과는 int (error)
		a1 = (byte)(b1 + 20); 
	
		//3. 아이 궁금해
		int test1 = 128; 
		byte bTest2 = (byte)test1;
		
		System.out.println("int test1 = " + test1);
		System.out.println("byte bTest2 = " + bTest2); 
		
		
	}
		
}
