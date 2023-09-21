
public class SuperClassEX {

	String className; 
	
	public SuperClassEX() {
		System.out.println("SuperClassEx 생성");
		this.className = "아빠클래스입니다."; 
	}
	
	public SuperClassEX(String className) {
		System.out.println("S클래스 인자있는 생성자 호출");
		this.className = className; 
	}
	
	public void printClassName() {
		System.out.println(this.className); 
	}
	
}
