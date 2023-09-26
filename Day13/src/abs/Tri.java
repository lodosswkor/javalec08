package abs;

public class Tri extends Shape {
	
	public Tri() {
		this.type = "삼각형";
	}

//	@Override
//	public void 나제정의안되() { // final method 제정의 안됨 (Error) 
//		
//	}
	
	@Override
	public void 넓이구하기() {
		this.printMyType();
		this.나제정의안되(); // 호출가능 (final method)  
		System.out.println("높이 : " + x); 
		System.out.println("밑변 : " + y); 
		int result = (int)(x * y * 0.5f); 
		System.out.println("넓이 : " + result); 
	}
}
