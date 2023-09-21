
public class Application01 {
	public static void main(String args[]) {
		
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
