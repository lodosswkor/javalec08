
// JVM --> Application01.main(); 


public class Application01 {
	
	String className;  // Application01 맴버(변수) 
								// 객체참조 맴버 
	static String className2; // Application01 맴버(변수) 
										  // static 영역 변수 
	
	public void nonStaticMethod() { // 객체참조 메서드 
		className = "하악 non Static"; 
		className2 = "으으응"; 
	}
	
	public static void main(String args[]) {
		
		className2 = "내이름은 className2"; 
		// this.className = "내 이름은 className이야"; 에러
		
		Application01 a01 = new Application01(); 
		a01.className = "하악";
		
		// Application01.className2 = "후훅"; static 속성 접근법 
		//a01.className2 = "하악";
		
		
		
		// 1. SuperClassEX 
		SuperClassEX ex1 = new SuperClassEX(); 
		ex1.printClassName();
		//ex1.printMySmartPhone(); // 자식한테 있는 메소드 
		
		System.out.println("=============="); 
		// 2. SubClassEX (extends SuperClassEX) 
		SubClassEX ex2 = new SubClassEX(); 
		//ex2.className = "하악하악"; // 아버지한테 상속받은 속성(맴버변수) 
		ex2.printClassName(); // 아버지한테 상속받은 메서드 
		ex2.printMySmartPhone(); // 자식한테만 있는 메서드 
		ex2.printMyClassName(); // 자식의 className 출력 
		
	}
}
