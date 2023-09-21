import computer.persp.*; 

public class Computer {

	public void 비디오카드달기(Radeon rd) {
		rd.showMonitor("화면이 나와요.");
	}
	
	public void 범용비디오카드달기(VideoCard vd) {
		vd.showMonitor("화면이 나와요");
	}
	
	
	public static void main(String[] args) {
	   
		Radeon rd = new Radeon(); 
		rd.showMonitor("화면출력해주세요"); // 오버라이딩된 자식 메서드 호출
		rd.showMonitor(); 
		// 오버로딩된 자식 메서드를 호출하는데, 
		// 그 내용이 this.showMonitor(String), super.showMonitor(String)
		
		VideoCard video = new Radeon();
		VideoCard video2 = new GeForce(); 
		
		video.showMonitor("이건 부모를 호출할까? 자식을 호출할까?");
		
		// 1. 객체생성 
		Computer com = new Computer(); 
		com.비디오카드달기(new Radeon()); // OK
		//com.비디오카드달기(new GeForce()); // Error 
		
		com.범용비디오카드달기(new Radeon());
		com.범용비디오카드달기(new GeForce());
		//com.범용비디오카드달기(new 대한민국비디오카드());
		
		// class 대한민국비디오카드 extends VideoCard 
		// showMonitor() 메서드를 오버라이딩 
	}
	
}
