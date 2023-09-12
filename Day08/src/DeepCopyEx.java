import java.util.Arrays;

public class DeepCopyEx {
	public static void main(String args[]) {
		
		// Deep Copy (깊은복사) -> 
		// 1. Heap 영역에서 실제 데이터를 복사(복제) 
		// 2. 새로 복제된 값의 주소값을 넣는다. (대상변수에) 
		 int a[] = {1,2}; // 목적지 
		 int b[] = {3,4,5}; // 복제할놈 
		 int temp[] = new int[3]; 
		 for(int i = 0; i < b.length; i++) {
			 temp[i] = b[i];
		 } 

		System.out.println("a=" +Arrays.toString(a)); 
		System.out.println("b=" +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		a = temp; 
		b[1] = -10; 
		System.out.println("a=" +Arrays.toString(a)); 
		System.out.println("b=" +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		// 배열복사에 관련되서는 함수(메서드)를 기본 제공합니다. 
		
		int aa[] = {1,2}; 
		int bb[] = {0,1,2,3}; 
		bb = aa; // 얕은복사 
		
		System.out.println(
				"aa(" + System.identityHashCode(aa) 
				+ ")=" + Arrays.toString(aa)
		); 
		System.out.println(
				"bb(" + System.identityHashCode(bb) 
				+ ")=" + Arrays.toString(bb)
		); 
		
		bb = aa.clone(); // 깊은복사 메서드 
		
		System.out.println(
				"aa(" + System.identityHashCode(aa) 
				+ ")=" + Arrays.toString(aa)
		); 
		System.out.println(
				"bb(" + System.identityHashCode(bb) 
				+ ")=" + Arrays.toString(bb)
		); 
		
		// Deep Copy2 
		int cc[] = {1,2}; 
		int dd[] = {1,2,3,4,5,6,7,8,9}; 
		int ee[] = Arrays.copyOfRange(dd, 2, 5); 
		System.out.println(Arrays.toString(ee));
		
	}
}
