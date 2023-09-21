/*
 * SubClassEX 라는 클래스는 SuperClassEx를 상속받는 자식 클래스입니다.
 * A가 B를 상속받는다. 
 * A extends B 
 * */
public class SubClassEX extends SuperClassEX { 
// SubClassEX 의 부모클래스는 SuperClassEX 
	
	// 아버지한테 없는 특성을 자식에게 넣고 싶다. 
	String className = "자식클래스의 className"; 
	String smartPhone = "갤럭시"; 
	
	public SubClassEX() {
		super("하악하악2"); // 부모클래스의 생성자 호출 
		System.out.println("SubClassEX 생성"); 
	}
	
	public void printMySmartPhone() {
		System.out.println(smartPhone); 
	}
	
	public void printMyClassName() {
		System.out.println("내꺼 : " + this.className); // 자기자신의 className 
		System.out.println("아빠꺼 : " + super.className); // 부모객체의 className
		
		// 외부 객체에서 Application01에 있는 className static
		// 속성을 접근할때 
		// 대상클래스Name.맴버변수 = 값
		// 대상클래스Name.method(); 
		Application01.className2 = "하악하악"; 
		
		
	}
	
	
}
