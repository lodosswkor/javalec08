
public class UseInstanceEx {
	public static void main(String[] args) {
		// 앗 난 원주율을 구하고 싶어!!; 
		// 반지름은 5야 
		CalClassEx cal = new CalClassEx();
		CalClassEx cal2 = new CalClassEx(); 
		
		cal.printMyName();
		float result = cal.원주율(4);
		System.out.println(result); 
		
		cal2.printMyName(); 
		result = cal2.원주율(10);
		System.out.println(result);
		
		System.out.println(cal == cal2);  
		
		int a = 10; 
		System.out.println("이종석");
		int[] b = {1,2,3}; 
		
		
	}
}
