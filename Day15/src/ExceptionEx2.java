import java.util.InputMismatchException;
import java.util.Scanner; 

class Student {
	
	String name; 
	int grade; 
	
	Student(String name, int grade) { // 생성자
		this.name = name; 
		this.grade = grade;
	}
	
	@Override 
	public String toString() {
		return "Student [name:" + name 
					+ ", grade:" + grade + "]";  
	}
	
}

public class ExceptionEx2 {
	
	static Student[] students = new Student[3]; // 학생명부 
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name; 
		int grade = 0; 
		int studentIdx = 0; //-- 배열 인덱스 
		
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			name = scanner.nextLine();
			try {
				System.out.println("학년을 입력해주세요 : ");
				grade = Integer.parseInt(scanner.nextLine()); //InputMismatchException
				students[studentIdx++] = new Student(name, grade); // ArrayIndexOutOfBoundsException
			} catch(InputMismatchException ex) {
				System.out.println("학년은 숫자만 입력해 주세요.");
				continue; 
			} catch(ArrayIndexOutOfBoundsException ex) {  // 배열 범위초과 
				System.out.println("방이 꽉찼습니다.");
				break;
			} catch(Exception ex) {
				System.out.println("알수 없는 예외가 발생하였습니다."); 
				continue; 
			}
			
			System.out.println(studentIdx + "명의 학생이 저장되었습니다.");
		}
		
		for(Student std : students) { // 향상된 for 문 
			System.out.println(std); // or System.out.println(std.toString());
		}
		
		
	}
	
}
