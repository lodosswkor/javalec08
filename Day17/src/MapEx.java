import java.util.*; 

class Student {
	String name;
	int grade; 
	Student(String name, int grade) {
		this.name = name; 
		this.grade = grade; 
	}
	void introduceMySelf() {
		System.out.println(String.format("안녕, 내 이름은 %s, %d 학년이야", name, grade));
	}
}

public class MapEx {

	public static void main(String[] args) {
		
		Map map = new HashMap(); // new HashTable(),.....
		map.put("name", "이종석");
		map.put("age", 10); // Wrapper Boxing ( 타입케스팅 )
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		
		
		List list = new ArrayList();
		for(int i = 0; i < 5; i ++) {
			Map m = new HashMap();
			m.put("name", "name : " + i); 
			m.put("age", "age : " + i); 
			m.put("home", "home : " + i);
			list.add(m);
		}
		
		// -- 데이터 꺼내기 
		System.out.println("List<Map> 꺼내기");
		System.out.println("Name \t Age \t Home");
		
		for(Object v : list) {
			Map rMap = (Map)v; 
			System.out.print(
						String.format(
								"%s \t %s \t %s \n", 
								rMap.get("name"), 
								rMap.get("age"),
								rMap.get("home")
						)
			); 
		} 
		
		
		List studentList = new ArrayList(); 
		for(int i = 0; i < 5; i++) {
			studentList.add(new Student("이종석" + i, i));
		}
		

		for(Object v : studentList) {
			Student std = (Student)v; 
			//v.introduceMySelf();
			std.introduceMySelf();
		} 
		
		// List/Set/Map은 Object 타입의 데이터를 저장할 수 있습니다. 
		
		//List<Integer> param = List.of("1","2","a","3",4,5,6,"하악"); // Error
		List<Integer> param = List.of(1,2,3,4,5,6,7);
		//List param = List.of("1","2",4,5,6);
		int result = sum(param);
		System.out.println("result = " + result);
		
	
		Map<String,Student> map2 = new HashMap<String, Student>();
		map2.put("1", new Student("이종석", 1)); 
		map2.put("2", new Student("이종석B", 2)); 
		map2.put("3", new Student("이종석A", 3));
		map2.get("1").introduceMySelf();
		//map2.get(map2)

		Map map3 = new HashMap();
		map3.put("1", new Student("이종석", 1)); 
		map3.put("2", new Student("이종석B", 2)); 
		map3.put("3", new String("aaaa"));
		((Student)map3.get("1")).introduceMySelf();
		
		
		
		
		
	}
	
	
	public static int sum(List<Integer> list) {
		int result = 0;
		for(Integer v : list) {
			result += Integer.parseInt(v.toString());
		}
		return result; 
	} 
	
}
