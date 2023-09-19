
// Math 클래스를 정의 
// Method Overloading (같은 이름의 행위 중첩) 
class Math {
	
	int add(int x, int y) {
		return x + y; 
	}

//  return 타입만 다른 경우는 메서드 오버로딩이 되지 않는다. 
//	float add(int x, int y) {
//		return (float)( x + y );
//	}
	
	int add(int x) {
		return x + x; 
	}
	
	float add(float x, float y) {
		return x + y; 
	}
}


public class MethodOverloadEx {
	public static void main(String[] args) {
		Math math = new Math(); 
		System.out.println(math.add(10)); 
		System.out.println(math.add(10, 20)); 
		System.out.println(math.add(10.0f, 20.0f));
		
	}
}


