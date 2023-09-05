
public class WhileExample {

	// while, do~while 
	// ex) 문제가 1-10까지의 숫자중 짝수만 출력하세요.
	// 반복문 / loop - 돌린다
	public static void main(String args[]) {
		
		for(int i = 1 ; i <=10; i++) {
			if(i % 2 == 0) System.out.println(i); 
		}
		
		int x = 8; 
		while(x <= 10) { // 8
			if(x++ % 2 == 0) System.out.println(x); //9 
		    //	x = x+1;
		}
		
		x = 1; 
		do {
			if(x % 2 == 0) System.out.println(x); 
		} while(x++ <= 10); 
		
		
	}
	
}
