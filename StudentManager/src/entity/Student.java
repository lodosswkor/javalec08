package entity;

/*
 * List<Student>
 * 학생 클래스 
 * */
public class Student {

	private int stdNo; //-- 학생코드 
	private String name; //-- 학생이름 
	private String grade; //-- 학년
	private int score; // 평균점수 
	private String insertDt; //-- 입력일시 
	private String updateDt; //-- 수정일시

	public Student() {}

	/*생성자*/ 
	public Student(int stdNo, String name, String grade, int score, 
							String insertDt, String updateDt) {
		this.stdNo = stdNo;
		this.name = name; 
		this.grade = grade;
		this.score = score; 
		this.insertDt = insertDt;
		this.updateDt = updateDt; 
	}
	
	
	public Student(String name, String grade, int score) {
		this(0,name,grade,score,null,null);
	}


	@Override
	public String toString() {
		String format = "{stdNo=%d,name=%s,grade=%s,score=%d,insertDt=%s,updateDt=%s}";
		return String.format(format, stdNo, name, grade, score, insertDt, updateDt);
	}


	
}
