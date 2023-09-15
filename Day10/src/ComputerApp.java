import javalec.computer.videocard.Geforce;
import javalec.computer.videocard.Radeon;
import javalec.computer.videocard.*;


public class ComputerApp {
	
	public static void main(String[] args) {
		// 다른폴더에 있는 GeForce 와 Radeon 객체를 생성
		// 하고 싶다. 어떻게?
		
//		javalec.computer.videocard.Geforce video1 = 
//				new javalec.computer.videocard.Geforce(); 
		Geforce video1 = new Geforce();
		video1.turnOnMonitor(); 
		//video1.defaultPrintName(); 
		//video1.protectedPrintName();
		
		Radeon video2 = new Radeon(); 
		video2.turnOnMonitor(); 
		
		
	}

}
