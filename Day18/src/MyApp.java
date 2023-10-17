import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyApp {

	public static void main(String[] args) {
		
		List<Person> list = List.of(
				new Person(1, "A", 100), 
				new Person(2, "B", 40),
				new Person(3, "C", 50),
				new Person(4, "D", 20)
		); 

		//-- list의 내용을 전체 출력하라. 
		// 1. 기본 for 
		System.out.println("for문 ======");
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		
		// 2. 향상된 for문 
		System.out.println("향상된 for문 ======"); 
		for( Person p : list ) {
			System.out.println(p); 
		}

		// 3. forEach(람다) 식 사용 
		System.out.println(" forEach(람다) 식 ======"); 
		list.forEach(v -> System.out.println(v));
		//list.forEach(System.out::println);
		
		// 조건, 점수가 50점 이상인 사람을 goodPersonList 에 담고싶다. 
		List<Person> goodPersonList = new ArrayList<Person>();
		// for문도 되고, 향상된 for문도 되고, forEach(람다)도 가능
		list.forEach(x -> {
			if(x.point >= 50) { 
				goodPersonList.add(x);
			}
		});
		
		System.out.println(goodPersonList);
		
		// Stream -> 편하자고 쓰는것. (필수가 아님) 
		// 1. 생성 -> Source (원본) 
		// 2. 처리 -> 중간처리 ( filter(), map() ...... ) 
		// 3. 종결 -> toList(), collect(), reduce() .... 
		
		// 조건, 점수가 50점 이상인 사람을 goodPersonList2 에 담고싶다. 
		// 1. 원본 생성(Stream<T>) list.stream(); -> 컬랙션 API에서 stream 소스 생성 
		
		List<Person> goodPersonList2 = list.stream() // 1. 생성(Source)  
														   .filter(val -> val.point >= 50) // 2. 중간처리
														   .filter(val -> val.name.equals("A"))  
														   //.collect(Collectors.toList()) jdk 16 이하 
														   .toList(); // 3. 종결 // 17이상 
														   //.filter(System.out::print);
														    
		
		System.out.println(goodPersonList2);
		
		//map/flatmap 
		// map : 일반적으로 A타입을 B타입으로 변경할때 
		// flatmap : 여러개의 collection 을 모두 flat하게 저장 -> 변경이 가능하다.
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5); 
		
		//-- 3이상인 값들에 + 65를 해서 char List로 바꾸고 싶다.
		List<Character> processed = stream.filter(x -> x >= 3)
												  .map((x)->new Character((char) (x+65)))
												  .toList();
		
		System.out.println(processed);
		
		
		String[][] sample = new String[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"},
			{"1","a"}
		};
		
				
		Stream<String[]> st = Arrays.stream(sample);
				
		// 1.소스얻기(Stream)
		List<String> list2 = 
					   st.flatMap(arr-> Arrays.stream(arr)) // 2. 중간처리 
						 .distinct() // 중복제거 
						 .sorted() // 기본 ASC 오름차순 
						/*
						 * .sorted((x, y) -> { //[1,2,3] // stream 시작이 1 // x->2 / y->1 return
						 * Integer.parseInt(x) > Integer.parseInt(y) ? 1 : Integer.parseInt(x) <
						 * Integer.parseInt(y) ? -1 : 0; })
						 */
						 .sorted(Comparator.reverseOrder()) // 내림차순 
						 .toList(); // 3. 종결 
		

		System.out.println(list2);
		
		// 나는 String[][] -> String[]
		
		// st.filter((x) -> true ); 이미 st라는 Stream은 생성 -> 종결까지 진행되었기 때문에 
		// 								   재활용 불가. 
		
		String[] resultArr = Arrays.stream(sample)
											 .flatMap(array -> Arrays.stream(array))
											 .filter(x -> { 
												return x.equals("a"); 	
											  })
											 //.forEach(null) // <-- 종결자라서 사용하면 이하를 사용 X
											 .peek(x -> System.out.println(x)) // <-- for each랑 똑같지만, 중간연산자
											 .toArray(String[]::new); // 메서드 연산자 
		
		

		
		
		
		
	}
	
}
