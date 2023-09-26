package abs;

public abstract class Shape {

	int x;  
	int y; 
	String type = "도형타입"; 
	
	public void printMyType() {
		System.out.println(type);
	}
	
	// final 메서드는 상속은 가능 / 제정의(override)는 불가 
	public final void 나제정의안되() { 
		System.out.println("하악하악");
	}
	
	// 넓이구하기() 메서드는 반드시 Override 하도록 
	// 강제 
	public abstract void 넓이구하기(); 
	
}
