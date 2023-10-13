import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		
		// 1. List 
		List list = new ArrayList(); // 1번 방법 
		list.add(0); 
		list.add(1);
		list.add(2); 
		list.add(0); 
		System.out.println(list); 
		
		list = Arrays.asList(1,2,3,4,5); // 2번 방법 
		System.out.println(list);
		
		list = List.of(1,2,3,4,5,6); // 3번 방법 
		System.out.println(list);
		
		int[] t = {1,2,3,4,5}; // 4번 방법 
		System.out.println(Arrays.asList(t));
		
		// 전체 출력하기 
		System.out.println("전통 for문");
		for( int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("향상된 for문");
		for( Object v : list) {
			System.out.println(v);
		}
		
		System.out.println("Lambda 식");
		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
		
		//-- List 줄이기 늘리기 (배열을 방수가 정해지면 끝) 
		System.out.println("List길이 가지고 놀기");
		List testList = new ArrayList(); //List.of(1,2,3,1,1); // 상수(불변객체)
		testList.add(1);
		testList.add(2);
		testList.add(3);
		
		System.out.println(testList);
		
		//-- 길이 늘리기 
		testList.add(10); //--> 1,2,3,1,1,10
		System.out.println(testList);
		testList.add(2,10);  //--> 1,2,?,3,1,1,10
		System.out.println(testList);
		
		//-- 길이 줄이기는?
		testList.remove(0); //--> 2,-10,3,1,1,10 
		System.out.println(testList);
		
		
		// 2. Set 
		System.out.println("Set 가지고 놀기");
		Set set = new HashSet(); 
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(0);
		System.out.println(set); 
		
		// 전체 출력하기 
//		System.out.println("전통 for문");
//		for( int i = 0; i < set.size(); i++) {
//			System.out.println(set.get);
//		}

		System.out.println("향상된 for문");
		for( Object v : set) {
			System.out.println(v);
		}
		
		System.out.println("Lambda 식");
		set.forEach(x -> System.out.println(x));
		set.forEach(System.out::println);
		

		System.out.println("Set 길이 가지고 놀기");
		//-- 길이 늘리기 
		set.add(10); //--> 1,2,3,1,1,10
		System.out.println(set);
		set.add(10);  //--> 1,2,?,3,1,1,10
		System.out.println(set);
		
		//-- 길이 줄이기는?
		testList.remove(0); //--> 2,-10,3,1,1,10 
		
		System.out.println(testList);
		
		// Iterator / Enumeration 
		
		
	}
	
}
