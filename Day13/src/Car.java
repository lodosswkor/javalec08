
public class Car extends Vehicle {

	public void 뽐내기() {
		System.out.println("나 벤츠야"); 
	}
	
	@Override
	public void moveForward() {
		System.out.println("자동차로 앞으로 이동");
		System.out.println("시속 100km"); 
	}

	@Override
	public void moveBackward() {
		System.out.println("자동차로 뒤로 이동");
		System.out.println("시속 50km"); 
	}
	
}
