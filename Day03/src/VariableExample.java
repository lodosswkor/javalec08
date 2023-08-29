
public class VariableExample {

	public static void main(String args[]) {
		
		//1. 변수명은 숫자로 시작할수 없다. 
		//int 4name; //-- 에러 
		int name4; //-- 에러가 아닙니다.
		
		//2. 변수명에는 _ , $외의 특수문자는 사용할 수 없습니다. 
		//int name#; // -- 에러 
		int $_name_id; //-- 에러 아님 
		
		//3. 변수명에는 키워드를 사용할 수 없다. 
		//int class; // class는 키워드 에러 
		//int if; // if는 키워드 에러
		int className; int Class_; // 에러아님 
		className = 10; 
		//int className; // 변수명은 중복 선언될 수 없다. 에러
		
	}
	
}
