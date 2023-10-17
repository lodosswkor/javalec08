import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface Add {
	abstract int add(int x, int y); 
	//abstract int minus(int x, int y); 
	default int minus(int x, int y) {
		return x - y;
	}
}

public class LambdaEx {
	public static void main(String[] args) {
		
		Add a = (x , y) -> x + y; 
		
		Add b = (x , y) -> {
			System.out.println("Add b 변수");
			System.out.println("x = " + x); 
			System.out.println("y = " + y); 
			return x + y; 
		};
		
		int result1 = a.add(1,2); //-- 출력을 안하고 결과값만 리턴 
		int result2 = b.add(2,3); //-- 출력후 결과값 리턴 
		
		System.out.println(String.format("result1 = %d", result1));
		System.out.println(String.format("result2 = %d", result2));
		
		a.minus(10, 20);
		
		Consumer c;
		Function f; 
		
	}
}
