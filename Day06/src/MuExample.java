
// 중첩된 for 문 
// -- 혼공얄코 ( 혼자서 공부하는 얇팍한 코딩지식 ) 
public class MuExample {

	public static void main(String args[]) {
		// 구구단 
		// x * y = ( x * y ) 
		// 우리는 git을 이렇게 사용하고 있어요 git-flow
		System.out.println("## 구구단 ##");
		for( int x = 2; x <= 9; x ++) {
			for( int y = 1; y < 10; y ++) {
				System.out.print(x + " x " + y + " = " + (x * y) + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("## 구구단 ##");
		
		for( int x = 1; x <= 9; x ++) {
			for( int y = 2; y < 10; y ++) {
				System.out.print(y + " x " + x + " = " + (x * y) + "\t");
			}
			System.out.print("\n");
		}
		
		
		
		
	}
	
}
