package abs;

public class Square extends Shape {

	//-- 기본 생성자 
	public Square() {
		this.type = "사각형";
	}
	
	//-- 강제구현메서드(Shape 에 추상메서드) 
	@Override
	public void 넓이구하기() {
		this.printMyType();
		System.out.println("높이 : " + x);
		System.out.println("밑변 : " + y);
		int result = x * y;
		System.out.println("넓이 : " + result); 
	}

}
