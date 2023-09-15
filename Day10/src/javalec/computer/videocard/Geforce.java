package javalec.computer.videocard;

// 접근제한자 
// public > protected > default > private 
// 접근을 제한하고자 하는 곧은 어디인가?
// 클래스 , 클래스 맴버는 모두 접근제한자를 둘 수 있다. 
// 1. 클래스 
// 2. 속성(맴버변수) 
// 3. 메서드(맴버메서드) 
// 4. 생성자(메서드) <-- 붙을수 있지만, 주로 public 

public class Geforce {

	//-- 맴버변수 
	public String modelName; 
	private final int price = -100;
	
	// 생성자(메서드) 
	// 1. 리턴타입 없음 
	// 2. 클래스명과 생성자(메서드)명 동일 
	public Geforce() {
		super();
//		modelName = "하악하악";
//		price = 1000; 
	}
	
	public Geforce(String model) {
		modelName = model;
		price = 10;
		final int a; 
		a = 10;
	}
	//---- 생성자메서드
	
	public void showModel() {
		System.out.println("Radeon");
	}
	
	public void turnOnMonitor() {
		System.out.println("모니터 켜욧!"); 
	}
	
	// default 메서드 
	void defaultPrintName() {
		System.out.println("디폴트 메서드야."); 
	}
	// protected 
	protected void protectedPrintName() {
		System.out.println("난 프로텍티드야.");
	}
	
	private void privatePrintName() {
		System.out.println("난 private");
	}
	
}
