
public class Array2Example {

	// 다차원 배열 사용 
	public static void main(String args[]) {
		
		//1. 2차원배열 선언 
		int[][] matrix; // int matrix[][]; 
		
		//2. 2차원배열 선언과 동시에, 데이터 공간만 만들기(값x) 
		//int a[] = new int[5];
		int[][] matrix2 = new int[2][4]; 
		
		int m[] = {1,2,3};
		int matrix3[][] = { 
				{1,2,3,4}, 
				{5,6,7,8} 
		};
		
		for(int idx1 = 0; idx1 < matrix3.length; idx1++) {
			
			for(int idx2 = 0; idx2 < matrix3[idx1].length; idx2 ++) {
				
				System.out.println("matrix3[" + idx1 + "][" + idx2 + "] = " 
											+ matrix3[idx1][idx2]);               
				
			}
			
		}
		
		// 퀴즈 "matrix3[" + idx1 + "][" + idx2 + "]  <-- 이출력을 제외하고
		// matrix3[0][0] = 1 식으로 출력하지 않고. 
		// 그냥 담겨져 있는 값만 출력하는 조건으로 
		// 향상된 for문으로 출력해보세요. 
		// hit는 그림 
		
		int x1[] = {1,2,3,4}; 
		for(int val : x1) {
			System.out.println(val);
		}
		
		for(int[] val1 : matrix3) {
			for(int val2 : val1) {
				System.out.println(val2); 
			}
		}
		
		
	}
	
}
