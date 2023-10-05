package winterface;

// 접근제한자 interface 인터페이스명 

public interface Paymethod {
	
	abstract void pay(); // 추상메소드
	//void payback(); // 추상메서드  -> 중간에 추가된 경우 
							  // 하위 구현 클래스는 오류(payback() 구현제약)
	
	default void payback() { // 하위호환성을 보장 
		System.out.println("환불"); 
	}
	
	// void pay(); 가능 
	//	void pay2() {
	//		// 구현부 
	//	} 
}
